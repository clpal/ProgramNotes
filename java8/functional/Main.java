package java8.functional;

import java.util.function.*;

// Predicate--> boolean test(T a)
// BiPredicate--> boolean test(T a,T b)
// Consumer --->void accept(T a)  no return
// BiConsumer --->void accept(T a,T b)  no return
// function ---> E apply(T a)
// Bifunction ---> E apply(T a,T b)
// Supplier ----> get()
//
public class Main {
    public static void main(String[] args) {

        BinaryOperator<Integer> unaryOperator=(x,y)-> x + y;
        System.out.println(unaryOperator.apply(11,12));
       /* UnaryOperator<Integer> unaryOperator=x->x;
        System.out.println(unaryOperator.apply(11));*/
/* Supplier<Integer> supplier= ()-> 11;
        System.out.println( supplier.get());*/
/*        BiFunction<Integer,Integer,String > f = (x,y)->x+" "+y;
        System.out.println( f.apply(110,112));*/

   /*     Function<Integer,Boolean> function= x-> x > 50;
       System.out.println(function.apply(103));*/


    /*    BiConsumer<String ,String> consumer = (x, y)-> System.out.println(x + " "+y);
         consumer.accept("Hello","World");*/

  /* List list = Arrays.asList(1,2,3,4,5);
    Consumer<Integer>c=x->System.out.println(x);
    Consumer<Integer>c=x->System.out.println(x);
   list.stream().forEach(x->System.out.println(x));*/
    /*Consumer<String >con=x->System.out.println(x);
        con.accept("Hello");*/
 /*       Predicate<Integer> predicate= x-> x>50;
       System.out.println( predicate.test(100));*/
/*        BiPredicate<Integer,Integer> biPredicate=(a,b)-> a>b;
        System.out.println( biPredicate.test(30,20));*/
    }
}
