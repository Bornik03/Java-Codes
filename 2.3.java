import java.util.*;

class Test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int s = sc.nextInt();
        int arr[] = new int[s];
        int i;
        System.out.println("Enter numbers");
        for (i = 0; i < s; i++) {
            int no = sc.nextInt();
            arr[i] = no;
        }
        for (i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted numbers are");
        for (i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}