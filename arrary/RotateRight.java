package arrary;

public class RotateRight {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("Original Array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        int n=3;

        for (int i = 0; i <n ; i++) {
           // int j;
            int last=arr[arr.length-1];
            for (int j = arr.length-1; j>0 ; j--) {
                     arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println("Rotated Array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
