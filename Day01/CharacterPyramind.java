package Day01;
import java.util.Scanner;

public class CharacterPyramind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}