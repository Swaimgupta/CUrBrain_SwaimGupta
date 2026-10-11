import java.util.*;

public class Q10 {

    public static void sieve(int n) {
        if (n < 2) {
            System.out.println("Enter a number greater than 1.");
            return;
        }

        // arr[i] is true while i is still considered prime.
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (arr[i]) {
                for (int j = i * i; j < n; j += i) {
                    arr[j] = false;
                }
            }
        }

        // Print all primes strictly less than n.
        for (int i = 2; i < n; i++) {
            if (arr[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit:");
        int n = sc.nextInt();

        sieve(n);
        sc.close();
    }
}
