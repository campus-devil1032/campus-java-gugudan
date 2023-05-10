package lotto_machine;

import java.util.TreeSet;

public class LottoChecker {
    public static void checkNumbers(TreeSet<Integer> winningNumbers, TreeSet<Integer> userNumbers) {
        int matchCount = 0;
        for (int number : userNumbers) {
            if (winningNumbers.contains(number)) {
                matchCount++;
            }
        }
        System.out.println("당첨 번호: " + winningNumbers);
        System.out.println("입력한 번호: " + userNumbers);
        System.out.println("일치하는 번호 개수: " + matchCount);
    }
}
