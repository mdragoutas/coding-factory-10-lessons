package gr.aueb.cf.ch2;

/**
 * Expressions Demo
 * Pizza App Calculator
 */
public class ExpressionsApp {
    public static void main(String[] args) {
        int friends = 4;
        int pizzasOrdered = 3;
        int slicesPerPizza = 8;

        int totalSlices;
        int slicesPerPerson;
        int leftoverSlices;
        int aliceSlices;
        int wallet = 50;
        int pizzaCost = 12;
        int drinkCost = 3;
        int totalBill;
        int costPerPerson;
        int remainder;
        int beforeArrival;
        int finalBill;
        final int DISCOUNT = 10; //10% discount

        //Λογική-Πράξεις
        beforeArrival = friends++;      //beforeArrival -> 4 , friends -> 5

        totalSlices = pizzasOrdered * slicesPerPizza; //24
        slicesPerPerson = totalSlices / friends;    //4
        leftoverSlices = totalSlices % friends;     //4

        aliceSlices = slicesPerPerson;
        aliceSlices = --aliceSlices;             //έφαγε ένα κομμάτι λιγότερο-3

        totalBill = (pizzasOrdered * pizzaCost) + (drinkCost * friends);
        finalBill = totalBill - (totalBill * DISCOUNT / 100);
        costPerPerson = finalBill / friends;
        remainder = finalBill % friends;

        wallet += 10;
        wallet -= 5;

        System.out.printf("Κομμάτια : %d, Ανά άτομο: %d, Επιπλέον: %d, Wallet: %d, Alice: %d, Άτομα: %d%n",
                totalSlices, slicesPerPerson, leftoverSlices, wallet, aliceSlices, friends);
        System.out.printf("Λογαριασμός: %d, Με έκπτωση: %d, Ανά άτομο: %d, Επιπλέον: %d%n",
                totalBill, finalBill, costPerPerson, remainder);
    }
}
