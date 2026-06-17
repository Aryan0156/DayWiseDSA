package Day04;

import java.util.Arrays;
import java.util.Scanner;

public class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                System.out.println(arr[i-1]+" -> " +count);
                count=1;
            }
            
        }
        System.out.println(arr[n-1]+" -> " +count);
        // System.out.println();
        sc.close();
    }
    
}
