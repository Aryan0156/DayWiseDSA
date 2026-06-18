import java.util.Scanner;

public class MinimumKlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("---------");
        int k = sc.nextInt();
        if( k<=0 || k>n){
           System.out.println("Invalid Window Size ");
           sc.close();
           return;
        }
        int sum =0;
        for(int i =0; i<k; i++){
            sum = sum+arr[i];    
        }
        int minsum = sum;
        for(int i =k; i<n; i++){
            sum = sum - arr[i-k] + arr[i];
            minsum = Math.min(minsum, sum);
        }
        System.out.println("Minimum sum : "+ minsum);
        sc.close();
    }
    
}
