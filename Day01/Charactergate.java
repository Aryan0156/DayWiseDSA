import java.util.Scanner;

public class Charactergate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; //sc.nextInt();
        for(int i =0; i<n; i++){
            for(char ch='A'; ch<=('A'+n-1-i); ch++){
                System.out.print(ch);
            }
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            for(char ch=(char)('A'+n-i-1); ch>='A'; ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
