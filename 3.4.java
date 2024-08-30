class Calculator {
    public void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void subtract(double num1, double num2) {
        System.out.println(num1 - num2);
    }

    public void subtract(int num1, int num2, int num3) {
        System.out.println(num1 - num2 - num3);
    }
}

class Driver {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.subtract(10, 5);
        calc.subtract(3.5, 1.2);
        calc.subtract(20, 8, 4);
    }
}
