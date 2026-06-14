import java.util.Scanner;

public class LeftArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;//sc.nextInt();
        for(int i =n; i>0; i--){
            for(int s=i; s>0; s--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
    

