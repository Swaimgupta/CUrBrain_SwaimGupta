import java.util.*;

public class Q19 {

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Performs right rotation by k positions
    public static void OptimiseStep(int[] arr, int k) {
        k = k % arr.length;

        if (k == 0) {
            return;
        }

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid array length");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the steps");
        int k = sc.nextInt();

        if (k < 0) {
            System.out.println("Invalid step");
            sc.close();
            return;
        }

        OptimiseStep(arr, k);

        System.out.println("Right rotated array:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
