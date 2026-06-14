import java.util.Scanner;

public class continuePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int b = 0; b < n; b++) {

            for (int i = 0; i < n; i++) {

                
                for (int j = 0; j < b * 4; j++) {
                    System.out.print(" ");
                }

                
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}