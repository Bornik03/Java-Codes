import java.util.*;

class Test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter elements");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1 = arr[0][0] + arr[1][1] + arr[2][2];
        int sum2 = arr[0][2] + arr[1][1] + arr[2][0];
        System.out.println("Sum of left diagonal is " + sum1);
        System.out.println("Sum of right diagonal is " + sum2);
    }
}