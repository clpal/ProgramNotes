package arrary;

public class EvenPosition {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50};
       /* for (int i = 1; i < arr.length ; i=i + 2) {
            System.out.println("Even Position :"+arr[i]);

        }*/ for (int i = 0; i < arr.length ; i=i + 2) {
            System.out.println("Odd Position :"+arr[i]);

        }
    }
}
