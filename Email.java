package emailapp;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternativeEmail;


    //constructor to receive first name and last
    public Email(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
    }
    // ask for department
    // generate a random password
    // set mailbox capacity
    // set alt email
    // change password


}
