package emailapp;

import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternativeEmail;


    //constructor to receive first name and last
    public Email(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // call a method ask for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }
    // ask for department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for Sales \n2 for Development \n3 for Accounting\n0 for none\nEnter department code: " );
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "Sales"; }
        else if (depChoice == 2) { return  "Dev"; }
        else if (depChoice == 3) { return  "Acct"; }
        else {return "";}




    }

    // generate a random password

    private String randomPassword(int length) {
        String passwordSet= "BCDEFGHIJKIOUR$@!@~!~^%^%*#235667";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) Math.random() * passwordSet.length();
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);
        }
    }
    // set mailbox capacity
    // set alt email
    // change password


