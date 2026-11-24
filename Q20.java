import java.util.*;

public class Q20 {

    public static void suffix(int[] arr) {
        int suffixSum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = suffixSum;
            suffixSum += current;
        }
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

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        suffix(arr);

        System.out.println("Running suffix sum:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
