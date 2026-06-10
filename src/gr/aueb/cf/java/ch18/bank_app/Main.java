package gr.aueb.cf.java.ch18.bank_app;

import gr.aueb.cf.java.ch18.bank_app.controller.AccountController;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountReadOnlyDTO;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static AccountController accountController = new AccountController();

    public static void main(String[] args) {
        String option;
        String iban;
        BigDecimal balance;

        while (true) {
            printMenu();
            option  = scanner.nextLine().trim();


            try {
                switch (option) {
                    case "1" -> {
                        System.out.print("Παρακαλώ εισάγετε το IBAN: ");
                        iban = scanner.nextLine().trim();
                        System.out.print("Παρακαλώ εισάγετε το αρχικό υπόλοιπο: ");
                        balance = new BigDecimal(scanner.nextLine().trim());

                        AccountReadOnlyDTO readOnlyDTO = accountController.createNewAccount(iban, balance);
                        System.out.println("\n Ο λογαριασμός δημιουργήθηκε ή ανανεώθηκε επιτυχώς");
                        System.out.println("IBAN: " + readOnlyDTO.iban() + ", Υπόλοιπο: " + readOnlyDTO.balance());
                    }

                    default -> System.out.println("\nΜη έγκυρη επιλογή.");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println("================================================");
        System.out.println("|           Υπηρεσία Τράπεζας              |");
        System.out.println("================================================");
        System.out.println("\nΥποσύστημα Τράπεζας");
        System.out.println("        1. Δημιουργία / Ενημέρωση λογαριασμού");
        System.out.println("        2. Προβολή λογαριασμού");
        System.out.println("Υποσύστημα Πελατών");
        System.out.println("        3. Κατάθεση");
        System.out.println("        4. Ανάληψη");
        System.out.println("        5. Ερώτηση υπολοίπου");
        System.out.println("[Qq]. Έξοδος");
        System.out.print("\nΕισάγετε μία επιλογή:  ");
    }
}
