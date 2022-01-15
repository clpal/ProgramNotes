package basic;

import java.util.Scanner;

public class SumofArrayElements {
    public static void main(String[] args) {

        int sum =0;
        int arr []={2,1,9,7,8};
        //for (int i = 0; i < arr.length ; i++) {
     for (int i:arr){
         //sum= sum +i;
         sum += i;
        }
        System.out.print("Sum of Array Element is = "+sum);
    }
}
