package java8.default_method;

public class Bike implements Vehicles {
    @Override
    public void horn() {
        System.out.println("pipip");
    }
}
