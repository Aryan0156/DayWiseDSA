package Day02;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose 1 for Centimeter To Meter \nChoose 2 for KiloGram to Gram");
        int n = sc.nextInt();
        if(n ==1){
            System.out.println("Enter the centimeter to convert in to meter");
            float x = sc.nextFloat();
            float res = x/100;
            System.out.println(res+" Meter");
        }
        else{
            System.out.println("Enter kg unit to convert in to gram ");
            float x = sc.nextFloat();
            float res = x*1000;
            System.out.println(res +" Gram");
        }
        sc.close();
    }
}
