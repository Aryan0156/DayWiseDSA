package Day06;
import java.util.Scanner;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] brr = new int[m];

        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        // Union
        System.out.print("Union: ");
        int i = 0, j = 0;

        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                System.out.print(arr[i] + " ");
                i++;
            } else if (arr[i] > brr[j]) {
                System.out.print(brr[j] + " ");
                j++;
            } else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
        }

        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

        while (j < brr.length) {
            System.out.print(brr[j] + " ");
            j++;
        }

        // Intersection
        System.out.print("\nIntersection: ");
        i = 0;
        j = 0;

        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                i++;
            } else if (arr[i] > brr[j]) {
                j++;
            } else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
        }

        sc.close();
    }
}