package arrary;
/*2. Write a program in your preferred language of choice.
        Given an array of integer numbers in random.
        Array= {2,4,1,6,8,11,12}
        And sum =52
        Find two numbers in the array whose sum of squares wise equal to 52.
        For example:
        42 + 62 = 16 + 36 = 52*/
public class SumSquares {
    static  int  []arr={2,4,1,6,8,11,12};
    public static void main(String[] args) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                 int sum=i*i +j*j;
                 if (sum==52){
                     System.out.println(i +","+j);
                 }

            }
        }
    }
}
