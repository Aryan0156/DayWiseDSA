package Day02;

import java.util.Scanner;


public class LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the characetr");
        char ch = sc.next().charAt(0);
        if(ch>= 'a' && ch<='z'){
            System.out.println("Lower case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
        sc.close();
    }
    
}
