package Day06;

import java.util.Arrays;

public class Chocolate {
    static int diff(int[] arr , int m){
        int n = arr.length;
        int min =Integer.MAX_VALUE;
        int diff =0;
        
        if(m<0 || n<0 || n<m){
            return -1;
        }
        Arrays.sort(arr);
        for(int i =0; i<=n-m; i++){
            diff = arr[i+m-1]-arr[i];
            min = Math.min(diff, min);

        }
        return min;

    }
    public static void main(String[] args) {
        int [] arr = {8, 6, 8, 10, 12, 14};
        int m = 3;
        System.out.println("Minimum Difference "+diff(arr, m));
        
    }
    
}
