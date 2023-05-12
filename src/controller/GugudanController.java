package controller;

import service.GugudanService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanController {
    private GugudanService gs = new GugudanService();

    // TODO -> 서비스 로직과 컨트롤러 로직을 분리!~
    public void run() throws IOException {
        gs.run();
    }

    // private GugudanBinaryService gbs = new GugudanBinaryService();
    // private GugudanSomeService gbs = new GugudanSomeService();

    public void runBinaryGugudan() {
        // some code ...
    }

    public void runSomeGugudan() {
        // ... some code
    }




}
