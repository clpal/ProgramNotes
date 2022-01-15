package arrary;

import java.util.Arrays;

public class SecondLargestElement {
    // using bubble sort
    public static int getSecondLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }

    public static void print2largest(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length-2; i >=0 ; i--) {
            if (arr[i] != arr[arr.length-1]) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
    // Time Complexity: O(n log n)
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 5, 11};
       // maxAndSecondMax(arr);
        print2largest(arr);
    }

    public static void maxAndSecondMax(int arr[]) {
        int maxA = arr[0];
        int maxB = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxA) {
                maxB = maxA;
                maxA = arr[i];

            } else if (arr[i] > maxB && arr[i] != maxA) {
                maxB = arr[i];

            }
        }
        System.out.println(maxA);
        System.out.println(maxB);
        // Time Complexity o(n)
    }
}
