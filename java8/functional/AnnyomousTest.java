package java8.functional;
/*class  AnnoyousClass implements Annyomous{

    @Override
    public void show() {
System.out.println("Hello implements Interface");
    }
}*/

public class AnnyomousTest {
    public static void main(String[] args) {

        // implement the interface in class and acces method through the object refrence
//        AnnoyousClass annoyousClass=new AnnoyousClass();
//        annoyousClass.show();
/*  create annyoumous class and access method
        Annyomous annyomous= new Annyomous(){

            @Override
            public void show() {
                System.out.println("Hello Annyomous");
            }
        };
        annyomous.show();*/

//
        Annyomous lambda= (x, y)  ->
            (x +y);

     System.out.println(   lambda.printdata(11,10));
//
//
//        Runnable runnable= ()-> System.out.println("Runnable Run method Lambda Interface");
//                  runnable.run();
    }
}
