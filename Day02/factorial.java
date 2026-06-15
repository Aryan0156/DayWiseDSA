package Day02;
import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
       System.out.println("factorial for number "+n+" is " + fact(n));
    }
    
}
