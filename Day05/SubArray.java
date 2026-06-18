// package Day05;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int cs = arr[0];
        int max = arr[0];
        for(int i=1; i<n; i++){
            cs = Math.max(arr[i], arr[i] + cs);
            max = Math.max(max, cs);
        }
        System.out.println("Max sum is "+max);
        sc.close();
    }
    
}
