package gr.aueb.cf.java.ch11;

public class User2 {
    private long id;
    private String firstname;
    private String lastname;

    public User2() {

    }

    public User2(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User2(long id, String firstname) {
        this.id = id;
        this.firstname = firstname;
    }

    public User2(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
