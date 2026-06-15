package Day03;

import java.util.Scanner;

public class Nthterm {
    static int term(int n ){
        if(n==1 || n==0){
            return n;
        }
        else{
            return term(n-1)+term(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of Nth term "+term(n));
        sc.close();
    }
}
