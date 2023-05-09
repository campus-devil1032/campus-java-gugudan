package lotto_machine;

import java.util.Scanner;
import java.util.TreeSet;

public class InputManager {
    public static TreeSet<Integer> getLottoNumbers(Scanner scanner, OutputManager outputManager) {
        TreeSet<Integer> numbers = new TreeSet<>();
        while (numbers.size() < 6) {
            outputManager.printInputPrompt(numbers.size() + 1);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number <= 45) {
                    if (numbers.contains(number)) {
                        outputManager.printDuplicateNumber(number);
                    } else {
                        numbers.add(number);
                    }
                } else {
                    outputManager.printOutOfRangeNumber(number);
                }
            } else {
                scanner.next();
                outputManager.printInvalidInput();
            }
        }
        return numbers;
    }
}
