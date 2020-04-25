
public class EmailObject {

    private String firstName;
    private String secondName;
    private String name;
    private String department;
    private String password;
    private String newEmail;
    private String alternateEmail;
    private int mailboxCapacity;

    public void EmailObject(String fnam, String snam, String dep) {

        this.firstName = fnam;
        this.secondName = snam;
        this.department = dep;

    }

    // Setters

    public void setPassword(String pw) {
        password = pw;
    }

    public void setAlternateEmail(String altE) {
        alternateEmail = altE;
    }

    public void setMailboxCapacity(int mc) {
        mailboxCapacity = mc;
    }

    // getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return newEmail;

    }

    public int getMailboxCapacity_(){
        return mailboxCapacity;
    }

}