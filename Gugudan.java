package Chapter04;
import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("구구단 프로그램을 시작합니다.");

        while(true) {


            System.out.println("단 수를 입력하세요.");
            int answer = scanner.nextInt();

            for (int i = 0; i < 9; i++) {
                System.out.println(answer + "*" + (i + 1) + "=" + answer * (i + 1));

            }

            System.out.println("종료를 원할 시 1을 입력  계속 실행 원할 시 아무 숫자 입력 ");
            int answer2 = scanner.nextInt();
            if(answer2==1){
                break;
            }



        }
        System.out.println("구구단 프로그램 종료");


    }

}



