package Day02;

import java.util.Scanner;

public class Cubefree {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextLong();
        long a = 1;
        long b = 1;
        long temp = n;
        for(int i =2; i*i<=temp; i++){
            int count=0;
            while(temp % i ==0){
                  count++;
                  temp /= i;
            }
            if(count>0){
                for(int p =0; p<count/3; p++){
                    a *=i;
                }
                for(int p =0; p<count%3;  p++){
                    b *= i;
                }
            }
        }
            if(temp>1){
                b *=temp;

            }
        
       
    System.out.println("a = "+a);
    System.out.println("b = "+b);
        sc.close();
    }
    
}
