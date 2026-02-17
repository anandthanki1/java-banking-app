package com.banking.app;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Banking App" );
        Bank bank = new Bank();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from below options:");
        System.out.println("1 - Create account");
        System.out.println("2 - Log In");

        int selection = scanner.nextInt();
        System.out.println("Please provide below information:");
        String firstName;
        String lastName;
        String email;
        String pin;
        int accountNumber;

        switch(selection) {
            case 1:
                System.out.print("First Name: ");
                firstName = scanner.next();
                System.out.print("Last Name: ");
                lastName = scanner.next();
                System.out.print("Email: ");
                email = scanner.next();
                System.out.print("Pin: ");
                pin = scanner.next();
                
                bank.createAccount(firstName, lastName, email, pin);
            case 2:
                System.out.print("Account number: ");
                accountNumber = scanner.nextInt();
                System.out.println("Pin: ");
                pin = scanner.next();

                bank.authenticate(accountNumber, pin);

            default:
                System.out.println("Selection is invalid. Please try again!");
        }



        scanner.close();
    }
}
