package test1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyfirstE {
    public void print(){
        Scanner scan = new Scanner(System.in);
        int c = 0;
        while (true){
            try {
                System.out.println("������ �Է����ּ���.");
                c = scan.nextInt();
                if(c >= 1 && c <= 999) {
                	for(int i = 1; i < 10; i ++) {
                		System.out.println(""+c+" x "+i+" = " + c*i);
                	}
                	break;
                }
                else {
        			System.out.println("error : ��ȿ���� ���� �����Դϴ�.");
        		}
            }catch (InputMismatchException errorRes) {
                scan = new Scanner(System.in);
                System.out.println("error : �߸��� �Է��Դϴ�.");

            }
        }
    }
    public static void main(String[] args) throws Exception {
        MyfirstE in = new MyfirstE();
        in.print();
    }
}