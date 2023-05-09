package lotto_machine;

import java.util.TreeSet;

public class LottoChecker {
    public static int countMatches(TreeSet<Integer> userNumbers, TreeSet<Integer> winningNumbers) {
        int count = 0;
        for (int userNumber : userNumbers) {
            if (winningNumbers.contains(userNumber)) {
                count++;
            }
        }
        return count;
    }
}
