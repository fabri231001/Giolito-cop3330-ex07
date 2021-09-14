/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final double cc = 0.09290304;
	    System.out.println("What is the length of the room in feet?");
        Scanner s1 = new Scanner(System.in);
        int l = s1.nextInt();
        System.out.println("What is the width of the room in feet?");
        Scanner s2 = new Scanner(System.in);
        int w = s2.nextInt();
        int a = l * w;
        System.out.println("You entered dimensions of " + l + " feet and " + w + " feet.");
        double sm = a * cc;
        System.out.println("The area is: \n" + a + " square feet." + "\n" + sm + " square meters.");
    }
}
