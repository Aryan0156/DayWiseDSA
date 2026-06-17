package Day05;

import java.util.Scanner;

public class Consecutivebinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int n = sc.nextInt();
        int c=0;
        int max =0;
        while (n>0){
            if(n%2 == 1){
                c++;
                max = Math.max(c, max);
            }
            else{
                c =0;
            }
            n = n/2;
            
        }
        System.out.println("Max count is "+ max);
        sc.close();
    }
    
}
