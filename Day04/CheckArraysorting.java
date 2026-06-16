package Day04;

import java.util.Scanner;

public class CheckArraysorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n ; j++){
                if(arr[j]<arr[i]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("sorted");
        }
        if(!flag){
        System.out.println("Not sorted");
        }
        sc.close();
    }
    
}
