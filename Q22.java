import java.util.*;

public class Q22 {

    // Merges two sorted arrays into num1 in-place.
    // The first m positions of num1 contain valid values;
    // num1 has capacity for m + n values.
    public static void Merge(int[] num1, int[] num2, int m, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Continue until every element from num2 has been placed.
        while (j >= 0) {

            if (i >= 0 && num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }

            k--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of valid elements in array 1:");
        int m = sc.nextInt();

        System.out.println("Enter the size of array 2:");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Invalid array sizes");
            sc.close();
            return;
        }

        // num1 has m valid elements and n extra spaces.
        int[] num1 = new int[m + n];
        int[] num2 = new int[n];

        System.out.println("Enter the " + m + " sorted elements of array 1:");
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }

        System.out.println("Enter the " + n + " sorted elements of array 2:");
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }

        Merge(num1, num2, m, n);

        System.out.println("Merged sorted array:");
        System.out.println(Arrays.toString(num1));

        sc.close();
    }
}
