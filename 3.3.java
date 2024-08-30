import java.util.*;

class Ex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students");
        int n = sc.nextInt();
        int roll[] = new int[n];
        String name[] = new String[n];
        double cgpa[] = new double[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name");
            name[i] = sc.nextLine();
            System.out.println("Enter cgpa");
            cgpa[i] = sc.nextDouble();
            if (cgpa[i] > max)
                max = i;
        }
        for (int j = 0; j < n; j++) {
            System.out.println("Roll: " + roll[j] + " Name: " + name[j] + " CGPA: " + cgpa[j]);
        }
        System.out.println("Name of the student with lowest cgpa is: " + name[max]);
    }
}