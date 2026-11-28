public class Q25 {

    public static int[] TempCalibration(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);

            if (diff < minDiff) {
                minDiff = diff;
                result[0] = arr[left];
                result[1] = arr[right];
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temps = {10, 22, 28, 29, 30, 40};
        int target = 54;

        int[] pair = TempCalibration(temps, target);
        System.out.println("(" + pair[0] + ", " + pair[1] + ")");
    }
}
