import java.util.Scanner;

public class continuepyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;

        for (int b = 0; b < n; b++) {

            for (int i = 0; i < n; i++) {

                
                for (int j = 0; j <= b * (n+2); j++) {
                    System.out.print(" ");
                }

                
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}