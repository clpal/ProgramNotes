package basic;

public class GCD {
    public static void main(String[] args) {
        int n1=22,n2=121;
        int gcd=1;
        for (int i = 1; i <=n1 && i<=n2 ; i++)
             if (n1%i==0 && n2%i==0)
             {
                 gcd=i;
        }
        System.out.println(gcd);
    }
}
