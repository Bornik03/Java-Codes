import java.util.*;
import java.lang.*;
import java.io.*;

class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int no = sc.nextInt();
        int temp = no;
        int a, b = 0;
        while (temp != 0) {
            a = temp % 10;
            b = b * 10 + a;
            temp /= 10;
        }
        if (b == no)
            System.out.println("Pallindrome number");
        else
            System.out.println("Not pallindrome number");
    }
}