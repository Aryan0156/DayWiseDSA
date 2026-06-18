import java.util.Scanner;

public class SubArraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("--------------");

        int target = sc.nextInt();

        int slow = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            while (sum > target && slow <= i) {
                sum -= arr[slow];
                slow++;
            }

            if (sum == target) {
                System.out.println("Subarray found from index "
                                   + slow + " to " + i);
                sc.close();
                return;
            }
        }

        System.out.println("Subarray not found");
        sc.close();
    }
}