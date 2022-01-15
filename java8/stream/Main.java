package java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       // IntStream.range(1,11).forEach(x->System.out.println(x));
       // IntStream.range(1,11).forEach(System.out::println);
      //long c=  Stream.of(10,20,22,44,56,78,12).filter(x->x>20).count();
       // System.out.println(c);
      /*  Stream.of("Java","Java Script","Pyton","php","android").
                filter(x->x.contains("J"))
                .map(String::toUpperCase).
                forEach(System.out::println);*/
        //Stream.generate(Math::random).limit(5).forEach(System.out::println);
      //  Arrays.asList("Java","Java Script","Pyton","php","android")
    /*    List list1=Arrays.asList("A","B");
        List list2=Arrays.asList("C","D","E");
        List list3=Arrays.asList("F");
        System.out.println(Stream.of(list1,list2,list3).flatMap(List::stream)
                .collect(Collectors.toList()));*/

        Map<String,List<Integer>>map= new LinkedHashMap<>() ;
        map.put("one",Arrays.asList(1,2,3));
        map.put("two",Arrays.asList(4,5,6));
        System.out.println(map.values().stream().flatMap(List::stream).collect(Collectors.toList()));

    }
}
