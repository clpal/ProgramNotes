package basic;

import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter the digit number :\n");
        int num = scanner.nextInt();
        int sum=0;
        while (num>0){
            int rem=num%10;
             sum =sum +rem;
            num=num/10;
        }
        System.out.print("sum of digit of given number is = "+sum);
        scanner.close();
    }
}
