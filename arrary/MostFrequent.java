package arrary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/find-the-maximum-repeating-number-in-ok-time/
//https://www.geeksforgeeks.org/frequent-element-array/
public class MostFrequent {
    public static void main(String[] args) {
        //int arr[] = {1, 3, 2, 1, 4, 1};
        //int arr[] = {10, 20, 10, 20, 30, 20, 20};
        int arr[] = {40,50,30,40,50,30,30};
        // int maxElement=mostfrequent(arr, arr.length);
        //System.out.println(hashmostfrequently(arr, arr.length));
        // System.out.println(maxElement);

       // int arr[] = {1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3};
        int n = arr.length;
        int freq =  maxFreq(arr , n);
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == freq) {
                count++;
            }
        }
        System.out.println("Element " +maxFreq(arr , n) +" occurs "  +count +" times" );

    }

    // O(n Log n)
    private static int mostfrequent(int arr[], int n) {
        int current_count = 1;
        int max_count = 1;
        int res = arr[0];
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                current_count++;
            else {

                if (current_count > max_count) {
                    max_count = current_count;
                    res = arr[i - 1];
                }
                //current_count=1;
            }
        }
        // if last element id most frequent
//        if (current_count > max_count) {
//            max_count = current_count;
//        //    System.out.println("jj"+max_count);
//            res = arr[n - 1];
//
//        }
        return res;
    }

    public static int hashmostfrequently(int arr[], int n) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hm.containsKey(key)) {
                int freq = hm.get(key);
                freq++;
                hm.put(key, freq);
            } else {
                  hm.put(key,1);
            }
        }
        int res = -1;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            if (maxCount < val.getValue()) {
                res = val.getKey();
                maxCount = val.getValue();
            }
        }
        return res;
    }
    static int maxFreq(int []arr, int n) {
        // using moore's voting algorithm
        int res = 0;
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                res = i;
                count = 1;
            }

        }

        return arr[res];
    }
}
