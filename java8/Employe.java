package java8;

public class Employe {
    private String empName;
    private int empId;

    public Employe(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                '}';
    }
}
