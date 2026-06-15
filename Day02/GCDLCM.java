package Day02;

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a, y=b;
        while(y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        int gcd = x;
        int LCM = (a*b)/gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+LCM);
        sc.close();

    }
    
}
