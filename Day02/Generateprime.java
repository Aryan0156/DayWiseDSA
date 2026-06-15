package Day02;

import java.util.Scanner;

public class Generateprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=2; i<a; i++){
            boolean flag = true;
            for(int n = 2; n*n<=i; n++){
                while(i%n==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
