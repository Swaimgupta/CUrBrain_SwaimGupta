import java.util.Scanner;

public class Main {

    public static int smallestSum(int[] arr) {
        int smallestSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int runningSum = 0;

            for (int j = i; j < arr.length; j++) {
                runningSum += arr[j];

                if (runningSum < smallestSum) {
                    smallestSum = runningSum;
                }
            }
        }

        return smallestSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Array must contain at least one element.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Smallest subarray sum: " + smallestSum(arr));

        sc.close();
    }
}
