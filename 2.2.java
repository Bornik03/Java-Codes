import java.util.*;

class Test22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int k = 0, no;
        for (int i = 0; i < 10; i++) {
            no = sc.nextInt();
            if (no % 2 == 0)
                k++;
        }
        System.out.println("Even numbers are:" + k);
        System.out.println("Odd numbers are:" + (10 - k));
    }
}