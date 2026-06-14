

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 2*n-1;
        for(int i=0; i<size; i++){
            for(int j =0; j<size; j++){
                int top=i;
                int bottom = size-1-i;
                int left =j;
                int right = size -1-j;
                int temp = Math.min(Math.min(top,bottom), Math.min(left,right));
                System.out.print(n-temp+" ");


            }
            System.out.println();
        }
        sc.close();


    }
}
