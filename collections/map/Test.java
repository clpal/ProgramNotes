package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        Map <MyStudent,Integer> m=new TreeMap<>();
        m.put(new MyStudent("chhote",22),1001);
        m.put(new MyStudent("Amit",32),1002);
        m.put(new MyStudent("Bhaiya",52),1003);
        m.put(new MyStudent("Shailesh",67),1004);
        m.put(new MyStudent("Priyanka",93),1005);
        System.out.println(m);
    }
}
