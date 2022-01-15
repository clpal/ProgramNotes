package java8.default_method;

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles= new Car();
        vehicles.horn();
        Vehicles vehicles1= new Bike();
        vehicles1.horn();

    }
}
