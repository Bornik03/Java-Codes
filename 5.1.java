import java.util.Scanner;
abstract class Student {
    int rollNo;
    long regNo;
    public Student(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = in.nextInt();
        System.out.print("Enter Registration Number: ");
        regNo = in.nextLong();
    }
    public abstract String course();
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Course: " + course());
    }
}
class Kiitian extends Student {
    public Kiitian(int rollNo, long regNo) {
        super(rollNo, regNo);
    }
    public String course() {
        return "B.Tech. (Computer Science & Engg)";
    }
}
 class lab51 {
    public static void main(String[] args) {
        Student stu;
        stu = new Kiitian(6123, 163163);
        stu.getInput();
        System.out.println("\nKiitian Student Details:");
        stu.displayDetails();
    }
}