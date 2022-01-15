package arrary;

public class RotateLeft {
    public static void main(String[] args) {
        // initialization array
        int arr[]=new int[]{10,20,30,40,50};
        // determine the number of array should be rotated
        int n=3;
        // dispaly original array
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");

        }
        // Rotated given array toward left n times toward left
        for (int i = 0; i <n ; i++) {
            int k,first;
            //  store the first element of array
            first=arr[0];
            for ( k = 0; k < arr.length-1 ; k++) {
                // shift array element one by one
                arr[k]=arr[k+1];

            }
                arr[k]=first;
        }
        System.out.println();
        //Displays resulting array after rotation
        System.out.println("Array after left rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
