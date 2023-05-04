import java.util.InputMismatchException;
import java.util.Scanner;

class GugudanFun {

    int num;

    public GugudanFun(int num) {
        this.num = num;
    }

    public void print() {
        
    	for (int i = 1; i <= 9; i++) {
            int result = num * i;
            System.out.printf("%d X %d = %2d\n", num, i, result);
        }
    }
}

public class gugudan extends GugudanFun {
    public gugudan(int num) {
        super(num);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("���ϴ� �ܼ��� ���ڸ� �Է��ϼ��� : ");

        while (true) {
            try {
                n = sc.nextInt();
                if (n < 1 || n > 999) {
                    System.out.print("1�� 9������ ���ڸ� �Է����ּ��� : ");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("���ڸ� �Է��� �����մϴ�. �ٽ� �Է����ּ��� : ");
                sc.nextLine();
            }
        }
        GugudanFun gugudanTable = new GugudanFun(n);
        gugudanTable.print();
    }
}