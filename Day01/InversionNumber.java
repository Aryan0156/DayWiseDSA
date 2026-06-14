

import java.util.Scanner;

public class InversionNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); 
        for(int i =n; i>0; i--){
            for(int j = i; j<n; j++){
                System.out.print("  ");
            }
            for(int k =1; k<=i; k++){
                System.out.print(k+" ");
            }
            for(int j =i-1; j>=1; j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}
