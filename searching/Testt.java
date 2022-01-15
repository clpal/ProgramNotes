package searching;

public class Testt {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 15, 16, 17};
        int element = 17;
        int low = 0;
        int high = arr.length - 1;
        int i = binary(arr, low, high, element);
        System.out.println(i);
    }
    private static int binary(int[] arr, int low, int high, int element) {
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == element)
                return mid;
            if (element > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
