import java.util.*;

public class Main {
    public static int Gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return Gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter the " + (i + 1) + "th Element");
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for(int i = 0; i < n; i++){
            result = Gcd(result, arr[i]);
        }

        System.out.print(result);
    }
}
