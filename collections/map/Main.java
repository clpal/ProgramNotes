package collections.map;

import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Map does not maintain order of  element
        Map<Integer ,String > map1= new HashMap();

        // it maintain order of element which you have added
        Map<Integer ,String > map2= new LinkedHashMap();

        // Sort the elements based upon key
        Map<Integer ,String > map3= new TreeMap();

        // key can't be dublicated
        // value can be dublicated
        // it can 't do any thing order,sorting

    /*    map1.put(5,"John");
        map1.put(10,"Neha");
        map1.put(5,"Java");  // overridden the value at key 5
        map1.put(7,"Ravi");
        map1.put(8,"Ravi");
        map1.put(18,"ABC");
        System.out.println(map1);*/
// {5=Java, 7=Ravi, 8=Ravi, 10=Neha}
        // {18=ABC, 5=Java, 7=Ravi, 8=Ravi, 10=Neha}

/*// maintain order
        map2.put(5,"John");
        map2.put(10,"Neha");
        map2.put(5,"Java");  // overridden the value at key 5
        map2.put(7,"Ravi");
        map2.put(8,"Ravi");
        map2.put(18,"ABC");
        System.out.println(map2);*/

        // maintain Sorting
        map3.put(5,"John");
        map3.put(10,"Neha");
        map3.put(5,"Java");  // overridden the value at key 5
        map3.put(7,"Ravi");
        map3.put(8,"Ravi");
        map3.put(18,"ABC");
        System.out.println(map3);
    }
}
