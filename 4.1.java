import java.util.Scanner;
class _2DShape {
    double area;
    double calculateCost() {
        return area * 40;
    }
}
class _3DBox extends _2DShape {
    double height;
    double volume;
    double calculateCost() {
        return volume * 60;
    }
}
class PlasticManufacturer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of 2D sheet in feet: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of 2D sheet in feet: ");
        double width = scanner.nextDouble();
        _2DShape sheet = new _2DShape();
        sheet.area = length * width;
        System.out.print("Enter height of 3D box in feet: ");
        double boxHeight = scanner.nextDouble();
        _3DBox box = new _3DBox();
        box.area = sheet.area;
        box.height = boxHeight;
        box.volume = box.area * boxHeight;
        double totalCost = sheet.calculateCost() + box.calculateCost();
        System.out.println("Total cost of plastic: Rs " + totalCost);
    }
}