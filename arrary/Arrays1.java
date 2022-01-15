package arrary;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        int arr[] = input();
        //sorting01(arr);
       // sorting01ef(arr, arr.length);
        Scanner scanner=new Scanner(System.in);
       int sum= scanner.nextInt();
     System.out.println(  pairSum(arr,sum));
    }

    public static int pairSum(int arr[], int sum) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void sorting01ef(int arr[], int n) {
        // two pointer i ,j approach
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (arr[i] == 0) {
                i++;
            }
            while (arr[j] == 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void sorting01(int arr[]) {
        int count1 = 0;
        int count0 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        int i = 0;
        for (; i < count0; i++) {
            arr[i] = 0;
        }
        for (; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void repeatingEff(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int value = Math.abs(arr[i]);
            if (arr[value] > 0) {
                // System.out.println("debug A"+arr[value]);
                arr[value] = -arr[value];
                //  System.out.println("debug B"+arr[value]);
            } else {
                System.out.println(value);
            }
        }

    }

    public static void repeatingEf(int arr[]) {
        int freq[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            freq[value]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                System.out.println(i + " ");
            }
        }
    }

    public static void repeating(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    //return arr[i];
                    count++;
                    System.out.println(arr[i]);
                    break;
                }
            }
       /* if (count  == 2) {
            break;
        }*/
        }

    }

    /*public static void increment(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
*/
    public static int maximum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of the array is :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("give me " + i + "th element :");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
