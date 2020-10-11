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

import java.lang.Math;
import java.util.Scanner;

 /**
 * This class is associated with the second task of the third seminar
 */
public class Task0302 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int n = 0;

    System.out.println("This app will take an integer and output exp(n) table\n");

    while (true) {
      System.out.print("Type in a number for n -> ");

      if (is.hasNextInt()) {
        n = is.nextInt();
        break;
      }

      System.out.println("Invalid input. Try again...\n");
      is.nextLine();
    }

    System.out.print("n");
    for (int i = 2; i <= n; i++) {
      System.out.printf("\tn^%d", i);
    }
    
    for (int i = 1; i < 11; i++) {
      System.out.print("\n");
      for (int j = 1; j <= n; j++) {
        System.out.printf("%d\t", (int)Math.pow(i, j));
      }
    }
    
    System.out.print("\n");

    is.close();
  }
}
