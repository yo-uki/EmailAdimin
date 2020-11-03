package emailapp;

import java.util.Scanner;

public class Email {

    private final String firstName;
    private final String lastName;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String alternateMail;
    private final String suxif= "company.com";
    public String emailName;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.alternateMail = setAlternateMail();
        this.password = initiatePassword();
        this.mailboxCapacity = 128;
        this.emailName=  emailName();
        System.out.println("New email created: "+emailName+
                "\nYour password: "+ password+
                "\nDefault mailbox capacity is "+mailboxCapacity+"MB\n");

    }

    public String getUserInfo() {

        return firstName+" "+lastName+"\nEmail: "+emailName+"\nMailbox Capacity: "+mailboxCapacity+"\nAlternate email: "+alternateMail;
    }


    //changing mailbox capacity
    public void setMailboxCapacity() {
        System.out.println("\nEnter new mailbox capacity:");
        int mc = skan.nextInt();
        skan.nextLine();
        this.mailboxCapacity = mc;
        System.out.println("Done");
    }

    //constructing Email name
    private String emailName(){
        return this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+suxif;
    }

    //generate random password
    private String initiatePassword(){
        String passwordSet = "ASDFGHJKLPOIUYTREWQZXCVBNM1234567890!$%&";
        char[] password = new char[8];
        for (int i=0; i<password.length;i++){
           int rand=  (int)((Math.random()*40 ));
           password[i]= passwordSet.charAt(rand);
        }
        return new String(password);
    }

    Scanner skan = new Scanner(System.in);

    //choosing department
    private String setDepartment(){
        System.out.println("Department code:\n 1- Sales\n 2- Development \n 3- Administration\n 0- No department\n");
        int option = skan.nextInt();
        skan.nextLine();
        switch (option){
            case 1:
                return "sale.";
            case 2:
                return "dev.";
            case 3:
                return "admin.";
            case 0:
                return "";
            default:
                System.out.println("There's no such department. Try again.");
                return setDepartment();
        }
    }

    //set and change alternate email
    public String setAlternateMail() {
        System.out.println("Enter alternate email:");
        alternateMail =  skan.nextLine();
        System.out.println("Alternate email saved");
        return alternateMail;
    }

    //set new password
    public void setPassword() {
        System.out.println("Enter current password:");
        String toCheck= skan.nextLine();

        if (toCheck.equals(this.password)){
        System.out.println("Enter new password\n");
        this.password = skan.nextLine();
            System.out.println("Password changed");
        }else{
            System.out.println("Wrong password. Try again");
            setPassword();
            }
        }
}
