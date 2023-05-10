package homework;

public class DanValueOverflowException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DanValueOverflowException(String message) {
        System.out.println(message);
    }
}