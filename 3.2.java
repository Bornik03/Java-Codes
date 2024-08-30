import java.util.*;

class Rectangle {
    double length;
    double breadth;

    void Read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        length = sc.nextDouble();
        System.out.println("Enter breadth");
        breadth = sc.nextDouble();
        Calculate(length, breadth);
    }

    void Calculate(double l, double b) {
        double area = l * b;
        double perimeter = (2 * l) + (2 * b);
        Display(area, perimeter);
    }

    void Display(double area, double perimeter) {
        System.out.println("Area of rectangle is: " + area);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle ex = new Rectangle();
        ex.Read();
    }
}