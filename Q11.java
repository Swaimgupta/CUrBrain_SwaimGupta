import java.util.Scanner;

public class Q11 {

    public static long Modulo(int[] arr, int size) {
        long result = 0;
        long mod = 1000000007L;

        for (int i = 0; i < size; i++) {
            result = (result + arr[i]) % mod;
        }

        return result;
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

        long result = Modulo(arr, n);
        System.out.println("The modulo result = " + result);

        sc.close();
    }
}
