package Day06;

public class Appearance {
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,2,2,2,2,3,34,3,2};

        int n = arr.length;
        int k = 3;
        int limit = n / k;

        for (int i = 0; i < n; i++) {

            
            boolean visited = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            if (visited) {
                continue;
            }

            int count = 0;

            
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            
            if (count >= limit) {
                System.out.println(arr[i] + " is repeated " + count + " times");
            }
        }
    }
}