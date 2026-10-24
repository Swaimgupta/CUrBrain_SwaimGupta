import java.util.Scanner;

public class Q13 {

    public static boolean RunningSum(int[] arr, int size, int divisor) {
        if (divisor == 0) {
            System.out.println("The divisor should not be zero.");
            return false;
        }

        long sum = 0;
        long k = Math.abs((long) divisor);

        for (int i = 0; i < size; i++) {
            sum += arr[i];

            if (sum % k == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the divisor:");
        int k = sc.nextInt();

        boolean result = RunningSum(arr, n, k);
        System.out.println("The result is: " + result);

        sc.close();
    }
}
