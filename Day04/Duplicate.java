package Day04;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0; i<n; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println("Unique elements: ");
        for(int i =0; i<n; i++){
            boolean flag = false;
            for(int j = 0; j<i; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
    
}
