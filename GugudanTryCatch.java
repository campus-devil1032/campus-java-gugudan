package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.RandomAccess;

class GugudanTryCatch {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    RandomAccess random = new RandomAccess();
    int ranN1 , ranN2 , result;
    int win , lose;
    String str;
    int answer;
 
    void question(){
        ranN1 = ((Object) random).nextInt(9) + 1;    // 0 ~ 8 + 1 => 1 ~ 9
        ranN2 = random.nextInt(9) + 1;
        System.out.print(ranN1 + " * " + ranN2 + " = ");
        result = ranN1 * ranN2;
        input();
    }
 
    void input(){
        try{
            str = br.readLine();
            answer = Integer.parseInt(str);
            if(answer == result){
                System.out.println("정답 : " + (++win) + ", 오답 : " + lose + "\n");
                question();
            }else if(answer == 999){
                System.out.println("구구단 종료. 총 게임수 : " + (win+lose) +", 정답 : " + win + ", 오답 : " + lose);
                System.exit(0);
            }else{
                System.out.println("오답. 정답 : " + win + ", 오답 : " + (++lose) + "\n");
                question();
            }
        }catch(IOException ioe){
            System.out.println("정답 숫자로 입력.");
            input();
        }
    }
    
    public static void main(String[] args){
        GugudanTryCatch gtc = new GugudanTryCatch();
        System.out.println(" 구구단 게임 [ 999 ] 를 입력 하면 종료합니다.");
        gtc.question();
    }
}
