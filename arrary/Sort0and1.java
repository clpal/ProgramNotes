package arrary;

public class Sort0and1 {
    public static void main(String[] args) {
        int arr[]= new int[]{1,0,1,0,0,1,0,1,0,1,0};
     int temp[]=new int[arr.length];
     int start=0;
     int end=arr.length-1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 1) {
                temp[end]=arr[i];
                end--;

            }
            if (arr[i] == 0) {
                temp[start]=arr[i];
                start ++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
             System.out.print(temp[i]+ " ");
        }
    }
}
