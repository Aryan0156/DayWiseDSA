package Day07;

public class TwoOdd {
    public static void findOddAppearing(int[] arr) {
        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }

        int setBit = xor & -xor;

        int x = 0, y = 0;

        for (int num : arr) {
            if ((num & setBit) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }

        System.out.println("Odd numbers are: " + x + " and " + y);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 3, 1};
        findOddAppearing(arr);
    }
}
