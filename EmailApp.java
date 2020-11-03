package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        //TEST
        //Email em1 = new Email("Jan","Kowalski");
        //emailAccountOptions(em1);

    }

    public static void emailAccountOptions(Email email){
        boolean quit =false;
        Scanner skan = new Scanner(System.in);
        showMenu();
        while (!quit){
            System.out.println("\nChoose option from menu:  (5- to show menu)");
            int option = skan.nextInt();
            switch (option){
                case 0:
                    quit=true;
                    break;
                case 1:
                    email.setPassword();
                    break;

                case 2:
                    email.setAlternateMail();
                    break;
                case 3:
                    email.setMailboxCapacity();
                    break;
                case 4:
                    System.out.println(email.getUserInfo());
                    break;
                case 5: showMenu();
                break;
                default:
                    System.out.println("Error. Wrong menu option");
                    showMenu();
                    break;
            }

        }

    }

    public static void showMenu(){
        System.out.println("Menu options:\n" +
                "0- quit menu\n" +
                "1-set new password\n" +
                "2- set alternate email\n" +
                "3- set mailbox capacity\n" +
                "4- get user info\n" +
                "5- show menu");
    }
}
