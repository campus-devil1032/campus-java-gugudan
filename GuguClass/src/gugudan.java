import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("구구단을 출력할 숫자를 입력(2~9). or 종료를 원하시면 0번을 눌러주세요.");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (number < 2 || number > 9) {
                System.out.println("2부터 9사이의 숫자를 입력해주세요.");
                continue;
            }

            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        scanner.close();
    }
}
