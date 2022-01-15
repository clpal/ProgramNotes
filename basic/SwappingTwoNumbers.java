package basic;

import java.util.Scanner;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter the number : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before Swapping "+"a= "+a +" b= "+b);
// 1st Ways using temp variable
       /*          int temp=a;
                  a=b;
                  b=temp;*/
// 2nd Ways with using temp variable
         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println("After Swapping "+"a= "+a +" b= "+b);

    }

}
