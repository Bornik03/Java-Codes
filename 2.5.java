import java.util.*;

class Test25 {
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
        int k = 1;
        for (i = 0; i < s; i++) {
            k = 1;
            for (int j = i + 1; j < s; j++) {
                if (arr[i] == arr[j] && (arr[i] != -1 && arr[j] != -1)) {
                    k++;
                    arr[j] = -1;
                }
            }
            if (arr[i] != -1) {
                System.out.println(arr[i] + " " + k + " times");
            }
        }
    }
}