package collections.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /* TreeSet represented Red-Black tree
    TreeSet is not thread safe
    Tree set using default natural ordering
    * */

   //java.lang. Comparable ===> compareTo(T ob)
   // java.util.Comparator===> compare(T ob1 ,T ob2)
    public static void main(String[] args) {
       // SortedSet<Integer> set= new TreeSet<>(); // sorted
        Comparator<NewStudent> studentComparator= (ob1,ob2)->ob1.getRollno()-ob2.getRollno();
        Set<NewStudent> set= new TreeSet<>(studentComparator); // sorted
        set.add(new NewStudent("chhote",1004));
        set.add(new NewStudent("Adesh",1002));
        set.add(new NewStudent("Zonu",1007));
        set.add(new NewStudent("Priaynaks",1000));
        set.add(new NewStudent("Shailesh",1003));
       /* set.add(2);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);*/
  /*      set.add(new Person("chhote",32));
        set.add(new Person("Adesh",2));
        set.add(new Person("Zonu",12));
        set.add(new Person("Priaynaks",13));
        set.add(new Person("Shailesh",21));*/
        // Exception in thread "main" java.lang.ClassCastException: collections.treeset.Person cannot be cast to java.lang.Comparable
        //

        System.out.println(set);
    }
}
