package org.example; //DO NOT DELETE
import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Program Name: Gallon Converter
 * Author: Lucas Ballou
 */

class Main {
    public static void main(String[] args) {
        int ogInput;
        double gallons;
        double quarts;
        double pints;
        double cups;
        double tablespoons;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of gallons: ");
        ogInput = input.nextInt();
        input.close();

        gallons = (double)ogInput;
        quarts = gallons * 4;
        pints = quarts * 2;
        cups = pints * 2;
        tablespoons = cups * 16;

        System.out.println("In " + gallons + " gallons there are: ");
        System.out.println(quarts + " quarts");
        System.out.println(pints + " pints");
        System.out.println(cups + " cups");
        System.out.println(tablespoons + " tablespoons");


    }
}