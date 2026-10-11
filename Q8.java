import java.util.*;

public class Q8 {

    public int factor(int n, int k) {
        List<Integer> list = new ArrayList<>();

        // Find factors in pairs.
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);

                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        if (k < 1 || list.size() < k) {
            return -1;
        }

        mergeSort(0, list.size() - 1, list);
        return list.get(k - 1);
    }

    public void mergeSort(int start, int end, List<Integer> list) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(start, mid, list);
            mergeSort(mid + 1, end, list);
            merge(start, mid, end, list);
        }
    }

    public void merge(int start, int mid, int end, List<Integer> list) {
        int i = start;
        int j = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while (i <= mid && j <= end) {
            if (list.get(i) <= list.get(j)) {
                temp.add(list.get(i));
                i++;
            } else {
                temp.add(list.get(j));
                j++;
            }
        }

        while (i <= mid) {
            temp.add(list.get(i));
            i++;
        }

        while (j <= end) {
            temp.add(list.get(j));
            j++;
        }

        for (int x = 0; x < temp.size(); x++) {
            list.set(start + x, temp.get(x));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q8 obj = new Q8();

        System.out.println("Enter the integer number:");
        int n = sc.nextInt();

        System.out.println("Enter the Kth factor:");
        int k = sc.nextInt();

        System.out.println(obj.factor(n, k));
        sc.close();
    }
}
