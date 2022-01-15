package greeksforgreeks.threadsamples.abstractionandencapsulation;

abstract class Base {

    final   void fun(){
        System.out.println("Base fun() called");
    }
}

class Derived extends Base {

}

public class AbstractSample {
    public static void main(String[] args) {
        {
            // compiler error as the line tries to create an
            // instance of abstract class. Base b = new Base();
            // We can have references of Base type.

            Base base = new Derived();
            base.fun();
        }

    }
}
