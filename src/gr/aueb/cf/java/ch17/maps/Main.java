package gr.aueb.cf.java.ch17.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();

        // Add & Update
        map1.put("GR", "Greece");
        map1.put("USA", "United States of America");
        map1.put("GR", "Germany");      // update

        // Get
        String country = map1.get("GR");
        System.out.println(country);

        // Remove
        map1.remove("USA");

        // Traverse
        map1.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
