/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment18 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        double Fahrenheit, Celsius;

        System.out.println("1.Fahrenheit to Celsius  \n2.Celsius to Fahrenheit \nChoice: ");

        int change = scan.nextInt();

        switch(change)

        {
            case 1:  System.out.println("Enter  Fahrenheit temperature: ");

                Fahrenheit = scan.nextDouble();
                Celsius = (Fahrenheit-32)*5/9;
                System.out.println("Celsius temperature is (from Fahrenheit) = " + Celsius);
                break;

            case 2:  System.out.println("Enter  Celsius temperature: ");

                Celsius = scan.nextDouble();
                Fahrenheit = ((Celsius*9)/5)+32;
                System.out.println("Fahrenheit temperature is (from Celsius) = " + Fahrenheit);
                break;
        }

    }
}