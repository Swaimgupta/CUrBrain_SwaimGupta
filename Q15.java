import java.util.Scanner;

public class Q15 {

    public static int getArr(int[] arr, int size) {
        long smallestValue = Math.abs((long) arr[0]);
        long temp;
        int result = arr[0];

        for (int i = 1; i < size; i++) {
            temp = Math.abs((long) arr[i]);

            if (temp < smallestValue) {
                smallestValue = temp;
                result = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Array size must be at least 1.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Element with minimum absolute value: " + getArr(arr, n));

        sc.close();
    }
}
