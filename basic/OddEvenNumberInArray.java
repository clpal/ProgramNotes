package basic;


public class OddEvenNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 16, 25};
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even number is in the Array: " + arr[i]);

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd number is in the Array: " + arr[i]);

            }
        }
    }
}
