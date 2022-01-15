package collections.listandset;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class main {
    public static void main(String[] args) {
      /*  list        vs         set
      ..................................
      indexed                  not indexed
      ordered                  not ordered always
    allowed duplicated         does not  allowed duplicated

       */
        System.out.println(" List Collection.....");
        List list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        System.out.println(" Set Collection.....");

        Set <Integer>set= new HashSet<>(); // not ordered and sorted
        Set <Integer>set1= new LinkedHashSet<>(); // ordered
        Set <Integer>set2= new TreeSet<>(); // sorted order not always make sure so contract
       // + used sortedset replace to set
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);
        //  advance set
       // Set<Integer> s1= Set.(1,2,3,4,5,2);

    }
}
