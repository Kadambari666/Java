package Main;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Some code that may throw a custom exception
            validateInput(150);
        } catch (CustomException e) {
            System.err.println("Custom Exception: " + e.getMessage());
        }
    }

    private static void validateInput(int value) throws CustomException {
        if (value > 100) {
            throw new CustomException("Value should not exceed 100");
        }
    }
}
