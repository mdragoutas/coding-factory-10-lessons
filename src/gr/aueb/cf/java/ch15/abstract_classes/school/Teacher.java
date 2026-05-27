package gr.aueb.cf.java.ch15.abstract_classes.school;

public class Teacher extends AbstractActor {
    private String subject;

    public Teacher() {}

    public Teacher(long id, String lastname, String firstname, String subject) {
        super(id, lastname, firstname);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
