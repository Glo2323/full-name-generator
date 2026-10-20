package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;


public class FullNameParser {

    public static void main(String[] args) {

        //Creating a Scanner
        Scanner nameSC = new Scanner(System.in);

        System.out.print("What is your full name: ");

        String input = nameSC.nextLine();

        String[] fullName = input.split(" ");


        String firstName = fullName[0];

        String lastName = fullName[1];



        if (fullName.length == 2) {
            System.out.printf("First name: %s\nMiddle name: (none)\nLast name: %s" , firstName, lastName);


        }else{
            String middleName = fullName[1];
            String lastName1 = fullName[2];
            System.out.printf("First name: %s\nMiddle name: %s\nLast name: %s", firstName, middleName, lastName1);

        }



    }

    //Creating methods



}
