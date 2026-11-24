import java.util.*;

public class Q21 {

    public static int Delete(int[] arr, int value) {
        int TI = -1;

        // Find the first occurrence of the target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                TI = i;
                break;
            }
        }

        // Shift elements left if the target was found
        if (TI != -1) {
            for (int r = TI; r < arr.length - 1; r++) {
                arr[r] = arr[r + 1];
            }
            return arr.length - 1;
        }

        // Leave the array unchanged if the target is not found
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the target element:");
        int value = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int length = Delete(arr, value);

        System.out.println("Array after deletion:");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
