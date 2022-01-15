package basic;

import static java.lang.Math.sqrt;

public class Test {
   static int i=2;
    public static void main(String[] args) {

            System.out.print(isPrimeRurrsion(12));




    }

    private static boolean isPrimeRurrsion(int n) {
// Corner cases
        if (n == 0 || n == 1)
        {
            return false;
        }

        // Checking Prime
        if (n == i)
            return true;

        // Base cases
        if (n % i == 0)
        {
            return false;
        }
        i++;
        return isPrimeRurrsion(n);
    }
// 2 3 4 5 7 9 11 13 17 19 23 25 29 31 37 41 43 47 49
// 2 3 4 5 7 11 13 17 19 23 29 31 37 41 43 47
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

}
