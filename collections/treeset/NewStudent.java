package collections.treeset;

public class NewStudent {
    private  String name;
    private  int rollno;

    public NewStudent(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "NewStudent{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
