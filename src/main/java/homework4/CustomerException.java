package homework4;

public class CustomerException extends RuntimeException {
    public CustomerException() {
    }

    public CustomerException(String message) {
        super(message);
    }
}
