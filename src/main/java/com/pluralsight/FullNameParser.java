package com.pluralsight;

import java.util.Scanner;


public class FullNameParser {

    public static void main(String[] args) {

        //Creating a Scanner
        Scanner nameSC = new Scanner(System.in);

        System.out.println("What is your full name: ");

        String input = nameSC.nextLine();

        String[] fullName = input.split(" ");

        System.out.println(fullName[0]);



    }

    //Creating methods
}
