/*
 * This file is a part of solutions for the Java Basics course in the
 *      Ventspils University of Applied Sciences.
 *  There is an attempt to maintain Google Java code style declared at
 *      https://google.github.io/styleguide/javaguide.html
 *  
 *  Author: Stanislavs Vjazovcevs
 *  Email:  cheshirebarsyk@gmail.com, s20vjazstan@venta.lv
 *
 *  Copyright Vjazovcevs Stanislavs, 2020
 */

import java.util.Scanner;

 /**
 * This class is associated with the second task of the second seminar
 */
public class Task0202 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int num = 0;

    System.out.println("This app will take a 5-digit number and print it in forward and reverse\n");

    while (num < 9999 || num > 99999) {
      System.out.print("Type in an 5-digit integer -> ");

      if (is.hasNextInt()) {
        num = is.nextInt();
      } else {
        System.out.println("Invalid input. Try again...\n");
      }
      
      if (num < 9999 || num > 99999) {
        System.out.println("Invalid input. Try again...\n");
      }

      is.nextLine();
    }

    int[] digits = new int[5];
    for (int i = 4; i > -1; i--){
      digits[i] = num % 10;
      num /= 10;
    }

    System.out.print("\nDigits:");
    for (int d : digits) {
      System.out.printf(" %d", d);
    }

    System.out.print("\nInversed digits:");
    for (int i = 4; i > -1; i--) {
      System.out.printf(" %d", digits[i]);
    }

    System.out.print("\n");

    is.close();
  }
}
