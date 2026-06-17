package gr.aueb.cf.java.ch18.bank_app;

import gr.aueb.cf.java.ch18.bank_app.controller.AccountController;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.NegativeAmountException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.ValidationException;
import gr.aueb.cf.java.ch18.bank_app.dao.AccountDAOImpl;
import gr.aueb.cf.java.ch18.bank_app.dao.IAccountDAO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountReadOnlyDTO;
import gr.aueb.cf.java.ch18.bank_app.service.AccountServiceImpl;
import gr.aueb.cf.java.ch18.bank_app.service.IAccountService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
    private final static Scanner scanner = new Scanner(System.in);
    private final static AccountController accountController = new AccountController(accountService);

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

                        // Client calls controller
                        AccountReadOnlyDTO readOnlyDTO = accountController.createNewAccount(iban, balance);
                        System.out.println("\n Ο λογαριασμός δημιουργήθηκε ή ανανεώθηκε επιτυχώς");
                        System.out.println("\nIBAN: " + readOnlyDTO.iban() + ", Υπόλοιπο: " + readOnlyDTO.balance());
                    }

                    case "2" -> {
                        List<AccountReadOnlyDTO> readOnlyDTOS = accountController.getAllAccounts();

                        if (readOnlyDTOS.isEmpty()) {
                            System.out.println("\nΔεν βρέθηκαν λογαριασμοί.");
                        } else {
                            System.out.println("\n-------------------------");
                            System.out.println("|        Λογαριασμοί       |");
                            System.out.println("\n-------------------------");
                            readOnlyDTOS.forEach(System.out::println);
                            System.out.println();
                        }
                    }

                    case "3" -> {
                        System.out.println("Παρακαλώ εισάγετε το IBAN: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το ποσό κατάθεσης: ");
                        BigDecimal depositAmount =  new BigDecimal(scanner.nextLine().trim());
                        accountController.deposit(iban, depositAmount);
                        System.out.println("\nΕπιτυχής κατάθεση");
                        System.out.println("\nΠοσό κατάθεσης: " + depositAmount + ", Νέο Υπόλοιπο: " +
                                accountController.getBalance(iban));
                    }

                    case "4" -> {
                        System.out.println("Παρακαλώ εισάγετε το IBAN: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το ποσό ανάληψης: ");
                        BigDecimal withdrawAmount =  new BigDecimal(scanner.nextLine().trim());
                        accountController.withdraw(iban, withdrawAmount);
                        System.out.println("\nΕπιτυχής ανάληψη");
                        System.out.println("\nΠοσό ανάληψης: " + withdrawAmount + ", Νέο Υπόλοιπο: " +
                                 accountController.getBalance(iban));
                    }

                    case "5" -> {
                        System.out.println("Παρακαλώ εισάγετε το IBAN: ");
                        iban = scanner.nextLine().trim();

                        balance = accountController.getBalance(iban);

                        System.out.println("\nΥπόλοιπο: " + balance);
                    }

                    case "Q", "q" -> {
                        System.out.println("\nΈξοδος...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("\nΜη έγκυρη επιλογή.");
                }
            } catch (AccountNotFoundException e) {
                System.out.println("\nΟ λογαριασμός δεν βρέθηκε.");   // Localization
            } catch (NumberFormatException e) {
                System.out.println("\nΜη έγκυρη μορφή αριθμού.");
            } catch (ValidationException e) {
                System.out.println("\nΛάθος στην επαλήθευση." + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("\nΑνεπαρκές Υπόλοιπο.");
            } catch (NegativeAmountException e) {
                System.out.println("\nΤο ποσό δεν μπορεί να είναι αρνητικό.");
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
