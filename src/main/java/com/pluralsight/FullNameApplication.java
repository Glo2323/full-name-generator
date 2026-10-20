package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        //Creating scanner
        Scanner nameSC = new Scanner(System.in);

        //Intro
        System.out.println("======Please enter your name======");

        //Pulling methods to ask for names
        String fullName = firstName(nameSC).trim() + " " + middleName(nameSC).trim() + " " + lastName(nameSC).trim() + ", " + suffix(nameSC).trim();

        // Printing out there full name
        System.out.printf("""
                Full name: %s
                """, fullName );
    }

    //Making methods

    //Method for asking your first name
    public static String firstName(Scanner nameSC){
        System.out.print("What is your first name ");
        return nameSC.nextLine();
    }

    //Method for asking your middle name
    public static String middleName(Scanner nameSC){
        System.out.print("What is your middle name ");
        return nameSC.nextLine();
    }

    //Method for asking your last name
    public static String lastName(Scanner nameSC){
        System.out.print("What is your last name ");
        return nameSC.nextLine();
    }

    //Method for asking your suffix
    public static String suffix(Scanner nameSC){
        System.out.print("Do you have a suffix in your name ");
        return nameSC.nextLine();
    }
}
