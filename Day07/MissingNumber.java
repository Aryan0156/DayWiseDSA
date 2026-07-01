package Day07;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 1,4};
        int missing = missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
    
}
