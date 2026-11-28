public class Q24 {

    public static int SmallestSum(int[] arr, int target) {
        int ds = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int ts = 0;

            for (int j = i; j < arr.length; j++) {
                ts += arr[j];

                if (ts >= target) {
                    int length = j - i + 1;

                    if (length < ds) {
                        ds = length;
                    }

                    // Valid when all array elements are positive.
                    break;
                }
            }
        }

        return ds == Integer.MAX_VALUE ? 0 : ds;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(SmallestSum(arr, target)); // Output: 2
    }
}
