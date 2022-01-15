package greeksforgreeks.threadsamples.abstractionandencapsulation;
 abstract  class Helper{
     static  void fun(){
         System.out.println("Geeks for Geeks");
     }
 }
public class StaticMethod  extends  Helper{

    public static void main(String[] args) {
        Helper.fun();
    }
}
