import java.util.*;

class Rectangle1 {
    double length, breadth;

    Rectangle1() {
        length = 0.0;
        breadth = 0.0;
    }

    Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double Calc() {
        return length * breadth;
    }

    public static void main(String args[]) {
        Rectangle1 obj1 = new Rectangle1();
        System.out.println("Area of rect1 (using default values): " + obj1.Calc());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        Rectangle1 obj2 = new Rectangle1(length, breadth);
        System.out.println("Area of rect2 (using user input): " + obj2.Calc());
    }
}