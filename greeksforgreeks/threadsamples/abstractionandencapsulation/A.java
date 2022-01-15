package greeksforgreeks.threadsamples.abstractionandencapsulation;

 abstract class A {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract  class B  {


    void m1() {
System.out.println("m1 method");
    }


    void m2() {
        System.out.println("m2 method");
    }
}
class C extends  B {
    public static void main(String[] args) {
    B c =   new C();
    c.m1();
    c.m2();
    }

}

