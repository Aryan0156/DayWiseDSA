package Day02;
import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A>B && A>C){
            System.out.println(A+" is Greater.");
        }
        else if(B>A && B>C){
            System.out.println(B+" is Greater.");
        }
        else{
            System.out.println(C+" is Greater.");
        }

        sc.close();
    }
    
}
