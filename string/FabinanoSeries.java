package string;

public class FabinanoSeries {
    public static void main(String[] args) {

        //System.out.println(fin2(9));
        System.out.println(nthFibonacci(9));

    }
    // recursive fun
    static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    // dynamic fun
    static int fib1(int n) {
        int f[] = new int[n + 2];
        f[1] = 1;
        f[0] = 0;
        for (int i = 2; i <= n; i++) {
            // add two previous numbers in series and store
            f[i] = f[i - 1] + f[i - 2];

        }
        return f[n];
    }

    // space optimised
    static int fin2(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

        }
        return b;
    }
    static long nthFibonacci(int n){
        // code here
       /*    if(n<= 1)
           return n;
           return nthFibonacci(n-1) + nthFibonacci(n-2);*/

        int a=0,b=1,c;
        for(int i=2;i<= n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;

    }
}
