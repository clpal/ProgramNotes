package greeksforgreeks.threadsamples.abstractionandencapsulation;

public class Encapsulate {
    private String name;
    private int roll;
    private int age;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }
    public int getAge() {
        return age;
    }

    public void setName(String _name) {
        name = _name;
    }

    public void setRoll(int _roll) {
        roll = _roll;
    }


    public void setAge(int _age) {
       age = _age;
    }


    public static void main(String[] args) {
        Encapsulate encapsulate = new Encapsulate();
        // setting the values of the variable
        encapsulate.setAge(1);
        encapsulate.setRoll(10);
        encapsulate.setName("Chhote Lal Pal");

        // Displaying the values
       // System.out.println(" Name :" + encapsulate.getName());
        //System.out.println("Age :" + encapsulate.getAge());

       // System.out.println("Roll No :" + encapsulate.getRoll());
        System.out.println("Geek's roll: " + encapsulate.roll);
    }
}
