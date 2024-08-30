import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String errorMessage) {
        super(errorMessage);
    }
}
class MyClass {
    public static double processInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        } else {
            return number * 2.0;
        }
    }
    public static void main(String[] args) {
        try {
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter");
           int a=sc.nextInt();
           processInput(a);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
    }
}
