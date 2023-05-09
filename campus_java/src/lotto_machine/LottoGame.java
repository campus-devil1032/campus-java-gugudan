package lotto_machine;

import java.util.*;

public class LottoGame {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        OutputManager outputManager = new OutputManager();
        LottoGenerator lottoGenerator = new LottoGenerator();
        LottoChecker lottoChecker;

        Set<Integer> winningNumbers = lottoGenerator.generateLottoNumbers();

        while (true) {
            Set<Integer> playerNumbers = inputManager.getInputNumbers();
            if (playerNumbers == null) {
                outputManager.printInvalidInput();
                continue;
            }
            lottoChecker = new LottoChecker(winningNumbers);
            lottoChecker.checkLottoNumbers(playerNumbers);
            break;
        }
    }
}
