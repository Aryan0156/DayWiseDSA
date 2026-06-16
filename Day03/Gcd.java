package Day03;

import java.util.Scanner;

public class Gcd {
    static int gc(int x, int y){
        if(y==0){
            return x;
        }
       
        return gc(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();;
        int b = sc.nextInt();
        int res = gc(a,b);
        System.out.println(res);
        sc.close();
    }
    
}
