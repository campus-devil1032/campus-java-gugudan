package lotto_machine;


import java.util.TreeSet;

public class OutputManager {
    public void printInputPrompt(int order) {
        System.out.printf("[%d] 번호를 입력하세요 (1-45): ", order);
    }

    public void printInvalidInput() {
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
    }

    public void printDuplicateNumber(int number) {
        System.out.printf("%d는 중복된 번호입니다. 다시 입력해주세요.\n", number);
    }

    public void printOutOfRangeNumber(int number) {
        System.out.printf("%d는 유효한 범위가 아닙니다. 다시 입력해주세요.\n", number);
    }

    public void printResult(int matchCount, TreeSet<Integer> winningNumbers, int pricePerGame) {
        System.out.println("당첨 번호는 " + winningNumbers + "입니다.");
       
    }
}
