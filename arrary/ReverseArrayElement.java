package arrary;

public class ReverseArrayElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
       int l=0;
       int h= arr.length-1;
       while (l<h){
             int temp=arr[l];
               arr[l]=arr[h];
                  arr[h]=temp;
             l++;
             h--;

       }
       for(int i:arr)
       System.out.println(i);
    }
}
