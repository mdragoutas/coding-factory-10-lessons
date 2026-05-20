package gr.aueb.cf.ch11;

public class Main {

    public static void main(String[] args) {
        Student alice = new Student();                          // Default constructor
        Student bob = new Student();
        Student student = new Student();

        Student student2 = new Student(4, "George","Adams");    // Overloaded constructor
        Student student3 = new Student(5, "Willem", "Defoe");

        alice.setId(1);
        alice.setFirstName("Alice");
        alice.setLastName("Jones");

        bob.setId(2);
        bob.setFirstName("Bob");
        bob.setLastName("Smith");

        student.setId(3);
        student.setFirstName("Charlie");
        student.setLastName("Brown");

        System.out.println("Alice ID:" + alice.getId());
        System.out.println("Alice First Name:" + alice.getFirstName());
        System.out.println("Alice Last Name:" + alice.getLastName());

        System.out.println("Bob ID:" + bob.getId());
        System.out.println("Bob First Name:" + bob.getFirstName());
        System.out.println("Bob Last Name:" + bob.getLastName());

        System.out.println("Charlie ID:" + student.getId());
        System.out.println("Charlie First Name:" + student.getFirstName());
        System.out.println("Charlie Last Name:" + student.getLastName());

        System.out.println("Student Count: " + Student.getStudentCount());

//        // Set values
//        alice.id = 1;
//        alice.firstName = "Alice";
//        alice.lastName = "Jones";
//
//        bob.id = 2;
//        bob.firstName = "Bob";
//        bob.lastName = "Smith";
//
//        student.id = 3;
//        student.firstName = "Charlie";
//        student.lastName = "Brown";
//
//        // Get values
//        System.out.println("Alice ID:" + alice.id);
//        System.out.println("Alice First Name:" + alice.firstName);
//        System.out.println("Alice Last Name:" + alice.lastName);
//
//        System.out.println("Bob ID:" + bob.id);
//        System.out.println("Bob First Name:" + bob.firstName);
//        System.out.println("Bob Last Name:" + bob.lastName);
//
//        System.out.println("Charlie ID:" + student.id);
//        System.out.println("Charlie First Name:" + student.firstName);
//        System.out.println("Charlie Last Name:" + student.lastName);
    }
}
