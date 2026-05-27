package gr.aueb.cf.java.ch15.abstract_classes.school;

public abstract class AbstractActor {
    private long id;
    private String lastname;
    private String firstname;

    public AbstractActor() {}

    public AbstractActor(long id, String lastname, String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
