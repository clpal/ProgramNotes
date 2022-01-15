package java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface MyPredicate<T> {
    public boolean operation(T  t);
}

public class Main {
    public static void main(String[] args) {
        List<Car> carList = Arrays.asList(new Car("Maruti", "Black", 30000),
                new Car("Tyoto", "White", 40000),
                new Car("BMW", "Black", 50000),
                new Car("Marcendes bene", "Yellow", 60000),
                new Car("Hyudai", "White", 7000000));
       // System.out.println(carList);
      // Predicate<Car> p = x -> x.getPrice() > 50000;
      /*  MyPredicate<Car> p = x -> x.getName().contains("M") ;
        for (Car car : carList) {
            if (p.operation(car)) {
                System.out.println(car.getName());
            }
        }*/
       List <Car>carList2= carList.stream().filter(x->x.getPrice()>50000).collect(Collectors.toList());
System.out.println(carList2);
    }
}
