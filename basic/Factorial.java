package basic;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {

    // int i=   fact(5);
      factorial(5);
        //System.out.println(i);
        //factorial(5);
       // fact(5);
    }
    // recusion
    static int fact(int n){
        if (n==0)
            return 1;
        return n*fact(n-1);
    }
 // loop
    public  static void factorial(int number){

      int fact=1;
        for (int i = 1; i <=number ; i++)
             fact=fact*i;


        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
