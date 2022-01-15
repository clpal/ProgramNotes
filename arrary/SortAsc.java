package arrary;

public class SortAsc {

    static void sortArrr(int[] arr, int l, int h) {
        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
          if(arr[i]==0){
              count ++;
               //=arr[i];
          }
          else{

          }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0};
        int h = arr.length - 1;
        int l = 0;
        sortArrr(arr,l,h);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }


    }
}
