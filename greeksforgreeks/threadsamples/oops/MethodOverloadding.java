package greeksforgreeks.threadsamples.oops;
class  Helper {
    static int multiply(int a ,int b)
    {
        return  a*b;
    }
     static double multiply( double a ,double b){

        return  a*b;
    }
    static int multiply(int a ,int b,int c)
    {
        return  a*b*c;
    }
}
public class MethodOverloadding {
    public static void main(String[] args) {
        System.out.println(Helper.multiply(1,2));
         ;
         Helper.multiply(1.1,2.2);
    }
}
