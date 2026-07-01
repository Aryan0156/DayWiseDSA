package Day07;

public class BitFlip {
    public static int flipBits(int n , int m) {
        int xor = n ^ m;
        int flipped = 0;
        while(xor !=0 ){
            xor = xor & (xor - 1);
            flipped++;
        }
        return flipped;
        
    }
    public static void main(String[] args) {
        int n = 5; 
        int m = 3;
        int flipped = flipBits(n,m);
        System.out.println("Flipped bits of " + n + " and " + m + " is: " + flipped);
    }
}
