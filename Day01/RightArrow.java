import java.util.Scanner;

public class RightArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;//sc.nextInt();

    
        for (int i = n; i >= 1; i--) {

            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        
        for (int i = 2; i <= n; i++) {

            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}