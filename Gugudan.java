package Chapter04;
import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������ ���α׷��� �����մϴ�.");

        while(true) {


            System.out.println("�� ���� �Է��ϼ���.");
            int answer = scanner.nextInt();

            for (int i = 0; i < 9; i++) {
                System.out.println(answer + "*" + (i + 1) + "=" + answer * (i + 1));

            }

            System.out.println("���Ḧ ���� �� 1�� �Է�  ��� ���� ���� �� �ƹ� ���� �Է� ");
            int answer2 = scanner.nextInt();
            if(answer2==1){
                break;
            }



        }
        System.out.println("������ ���α׷� ����");


    }

}



