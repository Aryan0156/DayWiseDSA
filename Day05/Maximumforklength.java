import java.util.Scanner;

public class Maximumforklength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        for(int i =0; i<k; i++){
            sum += arr[i]; 
        }
        int maxsum = sum;
        for(int i = k; i<n; i++){
            sum = sum - arr[i-k] + arr[i];
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println("Maximum Sum : "+maxsum);
        sc.close();
    }
    
}
