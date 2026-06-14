package Day02;

import java.util.Scanner;

public class Trianglevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 FOR Side \n Select 2 for Angle");
        int n = sc.nextInt();
        int a,b,c;
        if(n==1){
            System.out.print("Enter 3 side ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a+b>c && b+c>a && c+a>b){
                System.out.println("Validate");
            }
            else{
                System.out.println("Not valid");
            } 
        }
        
        else if(n==2){
            System.out.print("Enter 3 Angle");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if( a>0 && b>0 &&  c>0 && a+b+c == 180){
                System.out.println("Validate");
            }
            else{
                System.out.println("Not valid");
            } 
        }
        else{
            System.out.println("Invalid ");
        }
        
        sc.close();
    }
}
