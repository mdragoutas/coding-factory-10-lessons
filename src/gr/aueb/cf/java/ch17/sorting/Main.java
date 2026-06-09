package gr.aueb.cf.java.ch17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.7, 40),
                new Product("Bananas", 8.5, 30),
                new Product("Oranges", 6.2, 20),
                new Product("Milk", 1.5, 50),
                new Product("Apples", 22.3, 120)
        ));

        products.sort(Comparator.naturalOrder());     // ascending order
                                                      // needs Comparable interface
//        products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());     // descending order
//        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice));                         // ascending order by price
//        products.sort((a, b) -> a.getQuantity() - b.getQuantity());     // sort logic
        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice)
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getDescription)
                .reversed()
        );
    }
}
