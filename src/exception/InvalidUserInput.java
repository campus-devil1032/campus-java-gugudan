package exception;

public class InvalidUserInput extends Throwable {
    public InvalidUserInput() {
    }

    public InvalidUserInput(String message) {
        super(message);
    }
}
