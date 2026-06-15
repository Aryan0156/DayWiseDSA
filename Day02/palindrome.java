package Day02;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int temp =n;
        int sum =0;
        while(temp != 0){
            int rem = temp%10;
            sum = sum*10 + rem;
            temp = temp/10;
        }
        if(sum == n){
            System.out.println("Palindrome: ");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    
    }
    
}
