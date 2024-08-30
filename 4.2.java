import java.util.Scanner;
class Plate {
    int length;
    int width;
    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate created with dimensions: length = " + length + ", width = " + width);
    }
}
class Boxx extends Plate {
    int height;
    public Boxx(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Box created with dimensions: length = " + length + ", width = " + width + ", height = " + height);
    }
}
class WoodBox extends Boxx {
    int thickness;
    public WoodBox(int length, int width, int height, int thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox created with dimensions: length = " + length + ", width = " + width + ", height = " + height + ", thickness = " + thickness);
    }
}
class ConstructorExecutionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions :");
        System.out.print("Length: ");
        int length = scanner.nextInt();
        System.out.print("Width: ");
        int width = scanner.nextInt();
        System.out.print("Height: ");
        int height = scanner.nextInt();
        System.out.print("Thickness: ");
        int thickness = scanner.nextInt();
        WoodBox woodBox = new WoodBox(length, width, height, thickness);
    }
}