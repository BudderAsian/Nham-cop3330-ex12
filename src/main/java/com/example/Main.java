package com.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Richard Nham
 */

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double principal;
        double roi;
        int noOfYears;
        double returnAtEnd = 0.0;
        Scanner scannerUserInput= new Scanner(System.in);

        Locale usa = new Locale("en", "US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(usa);


        System.out.print("Enter the principal ");
        principal =  scannerUserInput.nextDouble();

        System.out.print("Enter the rate of interest(in percentage) ");
        roi =  scannerUserInput.nextDouble();
        roi=roi/100;

        System.out.print("Enter the number of years ");
        noOfYears =  scannerUserInput.nextInt();

        returnAtEnd = calculateSimpleInterest(principal, roi, noOfYears);
        System.out.println("After " + noOfYears + " years at " + roi*100 + ", the investment will be worth " + formatter.format(returnAtEnd));

        scannerUserInput.close();
    }

    public static double calculateSimpleInterest(double principal, double roi, int noOfYears) {
        return principal*(1 + roi * (double)noOfYears);
    }

}
