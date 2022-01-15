package arrary;

public class SumArray {
    public static void main(String[] args) {
        int sum = 90;
        int arr[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length-1; i++) {
            //for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[i+1]==90)
                    System.out.println(arr[i] +","+arr[i+1]);
            }

    }
}