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
 * This class is associated with the first task of the third seminar
 */
public class Task0301 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int n = 0;

    System.out.println("This app will calculate sum of the numbers [1..n]");

    while (true) {
      System.out.print("Type in a number for n -> ");

      if (is.hasNextInt()) {
        n = is.nextInt();
        break;
      }

      System.out.println("Invalid input. Try again...\n");
      is.nextLine();
    }

    long sum = 0;

    if (n > 0) {
      do {
        sum += n;
      } while (--n > 0);
    } else {
      sum = 1;
      
      do {
        sum += n;
      } while (++n < 0);
    }

    System.out.printf("Sum = %d\n", sum);

    is.close();
  }
}
