package test1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyfirstE {
    public void print(){
        Scanner scan = new Scanner(System.in);
        int c = 0;
        while (true){
            try {
                System.out.println("정수를 입력해주세요.");
                c = scan.nextInt();
                if(c >= 1 && c <= 999) {
                	for(int i = 1; i < 10; i ++) {
                		System.out.println(""+c+" x "+i+" = " + c*i);
                	}
                	break;
                }
                else {
        			System.out.println("error : 유효하지 않은 숫자입니다.");
        		}
            }catch (InputMismatchException errorRes) {
                scan = new Scanner(System.in);
                System.out.println("error : 잘못된 입력입니다.");

            }
        }
    }
    public static void main(String[] args) throws Exception {
        MyfirstE in = new MyfirstE();
        in.print();
    }
}