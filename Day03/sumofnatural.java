package Day03;

import java.util.Scanner;

public class sumofnatural {
    static int sum(int n){
        if(n==1 || n==0){
            return n;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("sum for "+n +" Natural number : " + sum(n));
        sc.close();
    }
    
}
