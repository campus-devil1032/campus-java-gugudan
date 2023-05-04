package MVC_gugudan;

public class GugudanController {
    private GugudanModel model;
    private GugudanView view;

    public GugudanController() {
        model = new GugudanModel();
        view = new GugudanView();
    }

    public void run() {
        try {
            int input = view.getInput();
            view.printResult(input);
            model.calculateGugudan(input);
        } catch (Exception e) {
            view.printError();
        }
     }

    public static void main(String[] args) {
        GugudanController controller = new GugudanController();
        controller.run();
    }
}

