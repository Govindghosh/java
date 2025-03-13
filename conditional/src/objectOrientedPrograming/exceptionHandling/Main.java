package objectOrientedPrograming.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        String name = "Govind";

        try {
            // Custom exception condition
            if (name.equals("Govind")) {
                throw new MyException("Name is Govind");
            }
            // Handling division
            divide(a, b);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (MyException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("This will always run");
        }
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
