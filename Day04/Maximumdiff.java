package Day04;

import java.util.Scanner;

public class Maximumdiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int left =0;
        int right = 1;
        int maxdiff = 0;
        if(arr[left]>arr[right])
        {
            maxdiff = arr[left] - arr[right];
        }
        else{
            maxdiff = arr[right] - arr[left];
        }
        int a =0;
        int b = 0;

        for(int i = 2; i<n; i++){
            left++;
            right++; 
            int temp =0;
            if(arr[left]> arr[right]){
                temp = arr[left] - arr[right];  
            }
            else{
                temp = arr[right] - arr[left];
            }
            if(temp>maxdiff){
                maxdiff = temp;
                a = arr[left];
                b = arr[right];
            }
        }
        System.out.println("Between "+a+" and "+b+ " Max difference: "+maxdiff);
        sc.close();

    }
    
}
