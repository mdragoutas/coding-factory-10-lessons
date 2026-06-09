package gr.aueb.cf.java.ch17.lifo_parking;

public class Main {

    public static void main(String[] args) {
        LifoParking lifoParking = new LifoParking();

        lifoParking.addCar("ABC123");
        lifoParking.addCar("DEF456");
        lifoParking.addCar("GHI789");

        String car = lifoParking.removeCar();

        car = lifoParking.removeCar();

        lifoParking.traverse();
    }
}
