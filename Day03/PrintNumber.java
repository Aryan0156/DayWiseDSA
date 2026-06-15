package Day03;

import java.util.Scanner;

public class PrintNumber {
    static void num(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        num(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
            num(n);
        
        sc.close();
    }
    
}
