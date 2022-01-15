package basic;

import java.util.Scanner;

public class PrimeNumber {
   static int i=2;
    public static void main(String[] args) {
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 pass
       Scanner scanner= new Scanner(System.in);
       int num=scanner.nextInt();
        printPrime(num);
       scanner.close();
    }
    static boolean isPrime(int n)
    {
// Corner case
        if (n <= 1)
            return false;

// Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    // Function to print primes
    static void printPrime(int n)
    {
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    static boolean isPrimeSqrt(int n)
    {

        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    // check only prime number
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
}
