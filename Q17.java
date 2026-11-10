import java.util.*;

public class Main {

    public static int Product(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int count = 0;
        int hf = Integer.MAX_VALUE;

        Map<Integer, Integer> products = new HashMap<>();

        // Step 1: Build the frequency map
        int i = 0;
        while (i < arr.length) {
            products.put(arr[i], products.getOrDefault(arr[i], 0) + 1);
            i++;
        }

        // Step 2: Find the most frequent product ID.
        // If frequencies tie, choose the numerically smallest ID.
        for (Map.Entry<Integer, Integer> order : products.entrySet()) {

            if (order.getValue() > count) {
                count = order.getValue();
                hf = order.getKey();

            } else if (order.getValue() == count) {
                if (order.getKey() < hf) {
                    hf = order.getKey();
                }
            }
        }

        return hf;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Array size cannot be negative.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter product IDs:");
        int i = 0;
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }

        int result = Product(arr);

        if (n == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Most popular product: " + result);
        }

        sc.close();
    }
}
