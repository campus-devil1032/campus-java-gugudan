package GugudanProject;

public class GugudanError extends Exception { // 상위 Exception 상속 받음 아직 잘 이해 X
    GugudanError() {

    }

    GugudanError(String message) {
        super(message);
    }
}
