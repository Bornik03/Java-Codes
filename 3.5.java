import java.util.*;

class Calc {
    void area(double a) {
        System.out.println("Area of circle is: " + (3.14 * a * a));
    }

    void area(double a, double b) {
        System.out.println("Area of triangle is: " + (0.5 * (a * a)));
    }

    void area(float a) {
        System.out.println("Area of square is: " + (a * a));
    }
}

class Gen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calc x = new Calc();
        System.out.println("1. Area of circle");
        System.out.println("2. Area of triangle");
        System.out.println("3. Area of square");
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        double c;
        if (ch == 1) {
            System.out.println("Enter radius");
            c = sc.nextDouble();
            x.area(c);
        } else if (ch == 2) {
            System.out.println("Enter base and height");
            c = sc.nextDouble();
            double d = sc.nextDouble();
            x.area(c, d);
        } else if (ch == 3) {
            System.out.println("Enter side size");
            float d = sc.nextFloat();
            x.area(d);
        } else
            System.out.println("Wrong input");
    }
}