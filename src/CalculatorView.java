import java.io.IOException;

public class CalculatorView {
    public void getInput() throws IOException {
        CalculatorController controller = new CalculatorController();
        controller.run();
    }
}
