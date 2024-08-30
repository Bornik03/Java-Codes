import java.util.*;
import java.lang.*;

class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100)
            System.out.println("Your grade is O");
        if (marks >= 80 && marks <= 89)
            System.out.println("Your grade is E");
        if (marks >= 70 && marks <= 79)
            System.out.println("Your grade is A");
        if (marks >= 60 && marks <= 69)
            System.out.println("Your grade is B");
        if (marks >= 50 && marks <= 59)
            System.out.println("Your grade is C");
        if (marks >= 40 && marks <= 49)
            System.out.println("Your grade is D");
        if (marks < 40)
            System.out.println("Your grade is F");
    }
}