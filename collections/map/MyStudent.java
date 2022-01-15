package collections.map;

import java.util.ArrayList;
import java.util.List;

public class MyStudent {
    private  String name;
    private  int age;

    public static void main(String[] args) {

    }
    public MyStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
