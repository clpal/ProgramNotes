package arrary;

public class CopyArray {
    public static void main(String[] args) {
        // initialize array
         int arr1[]={1,2,3,4,5};
         // Create another array arr2 with size of arr1
        int arr2[]=new int[arr1.length];
        // copy all element of one array to another array
        for (int i = 0; i < arr1.length; i++) {
             arr2[i]=arr1[i];

        }
        //Displaying elements of array arr1
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + " ");

        }
        System.out.println();
        //Displaying elements of array arr1
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i] + " ");

        }
    }
}
