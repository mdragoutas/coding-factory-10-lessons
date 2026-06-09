package gr.aueb.cf.java.ch17.lifo_parking;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LifoParking {
    private final Deque<String> parking = new LinkedList<>();

    public LifoParking() {}

    public List<String> getParking() {
        return List.copyOf(parking);        // unmodifiable copy
    }

    public void addCar(String car) {
        parking.push(car);          // Delegation
        System.out.println(LocalDateTime.now() + "-> Είσοδος // Αρ. Πινακίδας: " + car);
    }

    public String removeCar() {
        if (isEmpty()) {
            System.out.println(LocalDateTime.now() + "-> Το πάρκινγκ είναι άδειο!");
            return null;
        }

        String car = parking.pop();
        System.out.println(LocalDateTime.now() + "-> Έξοδος // Αρ. Πινακίδας: " + car);
        return car;
    }

    public int size() {
        return parking.size();
    }

    public void traverse() {
        parking.forEach(System.out::println);
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }
}
