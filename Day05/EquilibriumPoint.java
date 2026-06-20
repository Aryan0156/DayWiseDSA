import java.util.Scanner;

public class EquilibriumPoint {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    int totalsum =0;
    for(int i =0; i<n ; i++){
         arr[i]= sc.nextInt();
         totalsum += arr[i];
    }
    int leftsum = 0;
    for(int i = 0; i<n; i++){
        totalsum -= arr[i];
        if(totalsum == leftsum){
            System.out.println("EquilibriumPoint is "+i);
            sc.close();
            return;
        }
        leftsum += arr[i];
    }
    System.out.println("Not a EquilibriumPoint: ");
    sc.close();
   }
}