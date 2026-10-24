import java.util.Scanner;
import java.util.Arrays;

public class Q14 {

    public static int[] getArr(int[] arr, int size, int threshold) {
        int count = 0;

        // Pass 1: Count qualifying elements
        for (int i = 0; i < size; i++) {
            if (arr[i] >= threshold) {
                count++;
            }
        }

        // Allocate exactly the required output size
        int[] newarr = new int[count];
        int j = 0;

        // Pass 2: Copy qualifying elements in original order
        for (int i = 0; i < size; i++) {
            if (arr[i] >= threshold) {
                newarr[j] = arr[i];
                j++;
            }
        }

        return newarr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Array size cannot be negative.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            int value = sc.nextInt();

            if (value <= 0) {
                System.out.println("Enter positive values only.");
                sc.close();
                return;
            }

            arr[i] = value;
        }

        System.out.println("Enter the threshold value:");
        int threshold = sc.nextInt();

        if (threshold < 0) {
            System.out.println("Enter a non-negative threshold.");
            sc.close();
            return;
        }

        int[] result = getArr(arr, n, threshold);
        System.out.println("Filtered array: " + Arrays.toString(result));

        sc.close();
    }
}
