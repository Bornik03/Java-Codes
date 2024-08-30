class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println(e+"Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
