package gr.aueb.cf.java.ch17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        // Add
        cities.add("Athens");           // index = 0
        cities.add("Thessaloniki");     // index = 1
        cities.add("Patra");            // index = 2

        // Get
        String city = cities.get(0);    // Athens
        System.out.println(city);

        // Update
        int position = cities.indexOf("Patra");     // override equals
        if (position == -1) {
            System.out.println("Not found");
        } else {
            cities.set(position, "Larisa");
        }

        // Remove
        if (cities.contains("Larisa")) {            // override equals
            cities.remove("Larisa");                // override equals
        } else {
            System.out.println("Not found");
        }

        // Traverse

        // 1. For
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // 2. Enhanced for
        for (String c : cities) {
            System.out.println(c);
        }

        // 3. Iterator
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String c = it.next();
            System.out.println(c);
        }

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Thessaloniki")) {
                iterator.remove();      // cities.remove("Thessaloniki"); fails fast
            }
        }

        // 4. Functional over Iterative {Lambdas} (ο πιο σύγχρονος/ απλός τρόπος)
        cities.forEach(System.out::println);
        cities.removeIf(c -> c.equals("Athens"));     // override equals
    }
}
