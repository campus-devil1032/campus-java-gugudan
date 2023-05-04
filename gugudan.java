import java.util.Scanner;
public class gugudan {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("사용자가 입력한 단: " + input + "단");
        if (input < 2) {
            System.out.println("값을 잘못 입력했습니다.");
        } else if (input > 9) {
            System.out.println("값을 잘못 입력했습니다.");
        } else {
            for (int i = 1; i < 10; i++) {
                System.out.println(input * i);
            }
        }
    }
}
