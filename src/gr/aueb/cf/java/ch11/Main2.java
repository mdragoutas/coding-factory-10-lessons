package gr.aueb.cf.java.ch11;

public class Main2 {

    public static void main(String[] args) {
        User2 user = new User2(1, "George", "Bush");
        User2 user2 = new User2(2, "Bill");
        User2 user3 = new User2();
        User2 user4 = new User2("George", "Washington");

        user3.setFirstname("Barack");
        user3.setLastname("Obama");
        user3.setId(3);



        System.out.println("{"+ user.getId() + ", " + user.getFirstname() + ", " + user.getLastname() + "}");
        System.out.println("{" + user2.getId() + ", " + user2.getFirstname() + ", " + user2.getLastname() + "}");
        System.out.println("{" + user3.getId() + ", " + user3.getFirstname() + ", " + user3.getLastname() + "}");
        System.out.println("{" + user4.getId() + ", " + user4.getFirstname() + ", " + user4.getLastname() + "}");
    }
}
