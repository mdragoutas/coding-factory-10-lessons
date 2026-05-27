package gr.aueb.cf.java.ch15.abstract_classes;

/**
 * Java Bean - POJO (Plain Old Java Object)
 * Απλή data κλάση με τρία πεδία (fields)
 * Απλών και σύνθετων τύπων
 */
public class Student {
    private static int studentCount = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String region;

    public Student(int id, String firstName, String lastName, String region) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.region = region;
    }

    // default constructor
    public Student() {          // parameter-less constructor ή no-arg constructor
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
