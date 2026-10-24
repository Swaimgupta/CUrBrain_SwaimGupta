import java.util.Scanner;

public class Q16 {

    public static int SecondHighest(int[] arr, int size) {
        if (size < 2) {
            return -1;
        }

        int highestvalue = arr[0];
        int secondHighest = -1;

        for (int i = 1; i < size; i++) {
            if (arr[i] > highestvalue) {
                secondHighest = highestvalue;
                highestvalue = arr[i];
            } else if (arr[i] > secondHighest && arr[i] < highestvalue) {
                secondHighest = arr[i];
            }
        }

        return secondHighest;
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
            arr[i] = sc.nextInt();

            if (arr[i] < 0) {
                System.out.println("Scores should be non-negative.");
                sc.close();
                return;
            }
        }

        int result = SecondHighest(arr, n);
        System.out.println(result);

        sc.close();
    }
}
