package Day01;
import java.util.Scanner;

public class inverseHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

        
            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (i == n || i == 1 || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}