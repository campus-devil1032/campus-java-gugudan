package lotto_machine;

import java.util.Random;
import java.util.TreeSet;

public class LottoNumberGenerator {
    private Random random;

    public LottoNumberGenerator() {
        random = new Random();
    }

    public TreeSet<Integer> generateNumbers() {
        TreeSet<Integer> numbers = new TreeSet<>();
        while (numbers.size() < 6) {
            int number = random.nextInt(45) + 1;
            numbers.add(number);
        }
        return numbers;
    }
}
