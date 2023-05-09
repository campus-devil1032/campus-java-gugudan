package May09;

public class GugudanController {
    private GugudanView view;
    private GugudanModel model;

    public GugudanController() {
        view = new GugudanView();
        model = new GugudanModel();
    }

    public void run(int n) {
        if (n < 1 || n > 9) {
            System.out.print("1에서 9사이의 정수를 입력해주세요");
            return;
        }

        int[] results = model.calculate(n);
        view.printResult(results, n);
    }


}
