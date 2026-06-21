package Day07;

import java.util.Scanner;

public class KthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("---------------------");
        int k = sc.nextInt();
        if((n & (1<<k) )!= 0){
            System.out.println("Bit set");
        }
        else{
            System.out.println("Not a bit set");
        }
    }
    
}
