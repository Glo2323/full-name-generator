package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner nameSC = new Scanner(System.in);



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
}
