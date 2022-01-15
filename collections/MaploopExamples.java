package collections;

import java.util.HashMap;
import java.util.Map;

public class MaploopExamples {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap= new HashMap<>();
        hashmap.put(1,"A");
        hashmap.put(2,"B");
        hashmap.put(3,"C");
        hashmap.put(4,"D");
        for (Map.Entry<Integer,String> entry : hashmap.entrySet()){
System.out.println("key : "+entry.getKey() +","+ "value : "+entry.getValue());
        }


    }
}
