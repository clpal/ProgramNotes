package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap=false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    swap=true;
                }
            }
            if (swap == false) {
                break;
            }
        }

    }
}
