package java8.stream.paralle;

import java.util.Arrays;
import java.util.List;

public class ParllelMain {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6);

        list .stream().parallel().forEach(System.out::println);
        list .parallelStream().forEach(System.out::println);
    }

}
