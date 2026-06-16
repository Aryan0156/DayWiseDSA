package Day03;

import java.util.Scanner;

public class BinarySearch {

    static int sorting(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to search:");
        int key = sc.nextInt();

        int res = sorting(arr, key);

        if (res != -1) {
            System.out.println("Element found at index " + res);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}