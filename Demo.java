package Main;

public class Demo {
    public static void main(String[] args) {
        try {
            // Some code that may throw different types of exceptions
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catching a more general exception after specific ones
            System.err.println("Generic Error: " + e.getMessage());
        }
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}

	


