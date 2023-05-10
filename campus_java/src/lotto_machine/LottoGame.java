package lotto_machine;

import java.util.TreeSet;

public class LottoGame {
    public void start() {
        InputManager inputManager = new InputManager();
        TreeSet<Integer> userNumbers = inputManager.getLottoNumbers();

        LottoNumberGenerator numberGenerator = new LottoNumberGenerator();
        TreeSet<Integer> winningNumbers = numberGenerator.generateNumbers();

        inputManager.waitForGameStart();
        LottoChecker.checkNumbers(winningNumbers, userNumbers);
    }
}
