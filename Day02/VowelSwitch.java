package Day02;

import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = Character.toLowerCase(sc.next().charAt(0));
        if(!Character.isLetter(ch)){
            System.out.println("Invalid input");
        }
        else{
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vowel");
            break;
            default:
                System.out.println("Consonant ");
                break;
        }
    }
        sc.close();
    }
    
}
