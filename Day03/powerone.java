package Day03;
import java.util.Scanner;

public class powerone {

    static int pow(int n) {

        if (n == 1) {
            return 0;
        }

        if (n % 2 != 0) {
            return -1;
        }

        int ans = pow(n / 2);

        if (ans == -1) {
            return -1;
        }

        return ans + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = pow(n);

        if (result == -1) {
            System.out.println("Not a Power of 2");
        } else {
            System.out.println("Power of 2 is: " + result);
        }

        sc.close();
    }
}