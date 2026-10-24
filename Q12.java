import java.util.Scanner;

public class Q12 {

    public static long ModuloPower(int base, int power, int mod) {
        if (base < 0 || power < 0 || mod < 1) {
            return -1;
        }

        long result = 1 % mod;

        for (int i = 1; i <= power; i++) {
            result = (result * base) % mod;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base:");
        int base = sc.nextInt();

        System.out.println("Enter the power:");
        int power = sc.nextInt();

        System.out.println("Enter the mod:");
        int mod = sc.nextInt();

        long result = ModuloPower(base, power, mod);

        if (result == -1) {
            System.out.println("Enter valid base, power and mod.");
        } else {
            System.out.println("The result: " + result);
        }

        sc.close();
    }
}
