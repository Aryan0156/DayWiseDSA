package Day02;
import java.util.*;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("negative");
        }
        else if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
    }
    
}
