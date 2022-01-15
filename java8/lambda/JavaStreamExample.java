package java8.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

    /*    List<Float> productList2 = productsList.stream()
                .filter(p -> p.price > 30000) // filtering the data
                .map(p -> p.price) // fetching price
                .collect(Collectors.toList()); // collect as List
        System.out.println(productList2);*/
        // convert product list into map
   /*  Map<Integer,String>  productPriceMap =productsList.stream().
             collect(Collectors.toMap(p->p.id , p->p.name));
  System.out.println(productPriceMap);*/
        List<Float> pricelist = productsList.stream()
                .filter(p -> p.price > 30000) //filtering price
                .map(pm -> pm.price)// fetching price
                // .forEach(System.out::println);// iterating price
                .collect(Collectors.toList());
        System.out.println(pricelist);
    }
}
