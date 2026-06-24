package Day07;

import java.util.HashMap;

// import java.util.Scanner;

public class Odd{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 2, 4, 2, 4, 3, 5, 1, 1};
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(int n : map.keySet()     ){
            if(map.get(n)%2!=0){
                System.out.println(n);
            }
        }

    }
}