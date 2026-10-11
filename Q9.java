import java.util.*;

public class Q9 {

    public static int Isprime(int n) {
        if (n < 2) {
            return 2;
        }

        int t = n + 1;

        while (true) {
            boolean prime = true;

            for (int i = 2; i * i <= t; i++) {
                if (t % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                return t;
            }

            t++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int result = Isprime(n);
        System.out.println(result);

        sc.close();
    }
}
