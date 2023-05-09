package May09;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController() {
        view = new CalculatorView();
        model = new CalculatorModel();
    }

    public void run() {
        int[] inputs = view.getInputs();
        int result = model.calculate(inputs[0], inputs[1], inputs[2]);
        view.printResult(result);
    }
}
