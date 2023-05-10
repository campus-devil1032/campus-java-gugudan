package lotto_machine;

import java.util.Scanner;
import java.util.TreeSet;

public class InputManager {
    private Scanner scanner;

    public InputManager() {
        scanner = new Scanner(System.in);
    }

    public TreeSet<Integer> getLottoNumbers() {
        TreeSet<Integer> numbers = new TreeSet<>();
        while (numbers.size() < 6) {
            System.out.print(numbers.size()+1 + "번째" + " 로또 번호를 입력하세요 (1-45): ");
            int number = scanner.nextInt();
            if (number < 1 || number > 45) {
                System.out.println("1부터 45 사이의 숫자를 입력해주세요.");
                continue;
            }
            numbers.add(number);
        }
        return numbers;
    }

    public void waitForGameStart() {
        System.out.print("게임을 시작하려면 '1'을 입력하세요: ");
        String input = scanner.next();
        while (!input.equalsIgnoreCase("1")) {
            System.out.println("'1'을 입력하여 게임을 시작하세요.");
            System.out.print("게임을 시작하려면 '시작'을 입력하세요: ");
            input = scanner.next();
        }
    }
}
