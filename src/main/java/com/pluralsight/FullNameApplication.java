package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner nameSC = new Scanner(System.in);

        System.out.println("======Please enter your name======");

        String fullName = firstName(nameSC).trim() + " " + middleName(nameSC).trim() + " " + lastName(nameSC).trim() + " " + suffix(nameSC).trim();
        System.out.printf("""
                Full name: %s
                """, fullName );
    }

    public static String firstName(Scanner nameSC){
        System.out.print("What is your first name ");
        return nameSC.nextLine();
    }

    public static String middleName(Scanner nameSC){
        System.out.print("What is your middle name ");
        return nameSC.nextLine();
    }

    public static String lastName(Scanner nameSC){
        System.out.print("What is your last name ");
        return nameSC.nextLine();
    }

    public static String suffix(Scanner nameSC){
        System.out.print("Do you have a suffix in your name ");
        return nameSC.nextLine();
    }
}
