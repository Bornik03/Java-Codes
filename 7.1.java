import java.util.Scanner;
class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        try {
            int[] array = new int[4];
            for (int i = 0; i<5; i++) {
                array[i] =sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}