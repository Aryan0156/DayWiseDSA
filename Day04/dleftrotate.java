package Day04;

import java.util.Scanner;

public class dleftrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int left = 0;
        int right = d;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
        sc.close();
    }
    
}
