package Day07;

import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int element = n;
        boolean flag = true;
        while(element >1){
            if(element %2 != 0){
                flag = false;
            }
            element /= 2;
        }
        if(flag){
            System.out.print(n+ " is a power of 2: ");
        }
        if(!flag){
            System.out.print(n+" is not a power of 2: ");
        }
        sc.close();
    }
    
}
