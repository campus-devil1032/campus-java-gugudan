package controller;

import service.CalculatorService;

import java.io.IOException;

public class CalculatorController {
    private CalculatorService cs = new CalculatorService();

    // TODO -> 서비스 로직과 컨트롤러 로직을 분리!~
    public void run() throws IOException {
        cs.run();
    }

}
