package Day03;
import java.util.Scanner;

public class PowerAndRemainder {

    static int power(int n) {
        if (n < 2) {
            return 0;
        }

        return 1 + power(n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int p = power(n);

        while ((1 << p) > n) {
            p--;
        }

        int value = 1 << p;   // 2^p
        int rem = n - value;

        System.out.println(n + " = 2^" + p + " + " + rem);

        sc.close();
    }
}