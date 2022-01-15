package string;
import java.util.Arrays;
public class RemoveDublicateCharArray {
    public static void main(String[] args) {
//        let arr=['a','A','C', 'Z', 'b', 'B', 'd', 'E', 'z']
//        a,C,Z,b,d,E
//
char arr[]={'a','A','C', 'Z', 'b', 'B', 'd', 'E', 'z'};
        Arrays.sort(arr);
        int count =0;
        char newch[]= new char[arr.length];
        for(int i=0;i<arr.length-1;i++){
               if(arr[i]!=arr[i+1]){
                   newch[count ++]=arr[i];
                }
 }
        newch[count++]=arr[arr.length-1];
        for(int k=0;k<count;k++){
            arr[k]= newch[k];
             System.out.print(newch[k]+",");
        }

    }
}
