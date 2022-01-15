package basic;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.print("Please Enter the number: " );
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int rev=0;
        int  newRev=num;
        while(num>0){
         int rem=num%10;
           rev=rev*10 +rem;
            num=num /10;
        }
         if (newRev==rev)
        System.out.print(rev + " is Palindrom number ");
         else
             System.out.print(rev + " is Not Palindrom number ");
    }

}
