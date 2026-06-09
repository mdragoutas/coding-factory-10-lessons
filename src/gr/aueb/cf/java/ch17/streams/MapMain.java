package gr.aueb.cf.java.ch17.streams;

import gr.aueb.cf.java.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.7, 40),
                new Product("Bananas", 8.5, 30),
                new Product("Oranges", 6.2, 20),
                new Product("Milk", 1.5, 50),
                new Product("Apples", 22.3, 120)
        ));

        List<String> listOfDescriptions = products.stream()
                .map(Product::getDescription)
                .toList();

        String descriptionStr = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));

        System.out.println(listOfDescriptions);
    }


}
