package Day07;
public class XORLtoR {
    public static void main(String[] args) {
        int a = 3; 
        int b = 7; 
        int xor =0;
        for(int i =a; i<=b; i++){
            xor ^= i;

        }
        System.out.println(xor);

    }
}