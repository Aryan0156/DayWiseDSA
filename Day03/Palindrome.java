package Day03;

import java.util.Scanner;

public class Palindrome {
        static  boolean reverse(char[] arr, int left, int right){
            if(left>=right){
                return true;
            }
            if(arr[left] != arr[right]){
                return false;
            }
            return reverse(arr, left+1, right-1);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        boolean res = reverse(arr, 0, str.length()-1);
        if(res){
            System.out.println("String is Palindrome: ");
        }
        if(!res){
            System.out.println("String is not palindrome: ");
        }
        sc.close();
    }
}
        

    

