// package Day05;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = 12;
        int count=1;
        int max = 0;
        int num = 0;
        int [] arr = {1,1,1,1,1,2,2,2,3,3,3,4};
        for(int i =1; i<n; i++){
            if(arr[i] == arr[i-1]){
                count++;
                
                if(count> max){
                    max = count;
                num = arr[i];}
                
            }
            else{
                count = 1;
            }
        }
        System.out.println(num + " Max Count = "+max);
        
    
sc.close();
    }
    
}
