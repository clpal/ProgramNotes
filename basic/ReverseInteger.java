package basic;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter the number : ");
        int num = scanner.nextInt();


        int rev = 0;
        while ( num>0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.print("Reverse number is : "+rev);
    }
}
