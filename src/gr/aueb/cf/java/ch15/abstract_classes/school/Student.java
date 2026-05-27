package gr.aueb.cf.java.ch15.abstract_classes.school;

public class Student extends AbstractActor{
    private String region;

    public Student() {}

    public Student(long id, String lastname, String firstname, String region) {
        super(id, lastname, firstname);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
