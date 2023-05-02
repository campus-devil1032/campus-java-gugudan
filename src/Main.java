import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 ~ 999 사이의 숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        try {
            if(number < 1 || number > 999){
                throw new Exception("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요");
            }

            MultiTable multiTable = new MultiTable(number);
            multiTable.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}