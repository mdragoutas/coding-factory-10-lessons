package gr.aueb.cf.ch11;

/**
 * Java Bean - POJO (Plain Old Java Object)
 * Απλή data κλάση με τρία πεδία (fields)
 * Απλών και σύνθετων τύπων
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;

    // default constructor
    public Student() {          // parameter-less constructor ή no-arg constructor

    }

    // Overloaded Constructor
    public Student(int id , String fistName, String lastName) {
        this.id = id;
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
