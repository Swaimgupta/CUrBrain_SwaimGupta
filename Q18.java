import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Reverse(int[] arr, int start, int end) {

        // Validate the array and requested index range.
        if (arr == null || start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid array or index range.");
            return;
        }

        // Reverse the selected segment in place using two pointers.
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the start index:");
        int start = sc.nextInt();

        System.out.println("Enter the last index:");
        int end = sc.nextInt();

        Reverse(arr, start, end);

        System.out.println("Result: " + Arrays.toString(arr));

        sc.close();
    }
}
