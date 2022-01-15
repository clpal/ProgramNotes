package basic;

import java.util.Scanner;

public class EvenAndOddDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("PLease enter the digit number :\n");
        int num=scanner.nextInt();
        int countEven = 0,countOdd=0;
        while (num!=0){
            int rem=num%10;
            if (rem%2==0){
                countEven++;
            }
            else {
                countOdd++;
            }
             num=num/10;
        }
        System.out.println("Number of even digits: "+countEven);
        System.out.println("Number of odd digits: "+countOdd);
        scanner.close();
    }
}
