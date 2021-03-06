package arrary;

public class RemoveDuplicateElement {
  public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
        //length = removeDuplicateElements(arr, length);
        length = removeDuplicateElementsSeparateIndex(arr, length);

        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
// Remove Duplicate Element in Array using Temporary Array
    public static int removeDuplicateElements(int arr[], int n){
        if (n == 0 || n==1) {
            return  n;
        }
        int temp[]=new int [n];
        int j=0;
        for (int i = 0; i <n-1 ; i++) {
            if (arr[i] != arr[i+1]) {
                   temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];
        for (int i = 0; i <j ; i++) {
            arr[i]=temp[i];

        }
        return j;
    }
    // Remove Duplicate Element in Array using separate index

    public static int removeDuplicateElementsSeparateIndex(int[] arr, int n){
        if (n == 0 || n==1) {
            return  n;
        }
      int j=0;// for next element
        for (int i = 0; i <n-1 ; i++) {
            if (arr[i] != arr[i+1]) {
              arr[j++]=arr[i];
            }

        }
        arr[j++]=arr[n-1];
        return  j;
    }
}
