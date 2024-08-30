import java.util.*;

class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }
}

class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter width");
        double w = sc.nextDouble();
        System.out.println("Enter height");
        double h = sc.nextDouble();
        Box obj = new Box(l, w, h);
        System.out.println("Volume is: " + obj.volume());
    }
}