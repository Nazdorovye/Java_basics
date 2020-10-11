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
 * This class is associated with the fourth task of the third seminar
 */
public class Task0304 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int num = -1;

    System.out.println("This app will take in a natural number and make some calculations\n");

    while (num < 0) {
      System.out.print("Type in non-negative integer -> ");

      if (is.hasNextInt()) {
        num = is.nextInt();

        if (num > -1) {
          break;
        }
      }

      System.out.println("Invalid input. Try again...\n");      
      is.nextLine();
    }

    long sum = 0;
    long evenSum = 0;
    long oddSum = 0;

    for (int i = 0; i <= num; i++) {
      sum += i;
      
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }

    System.out.printf("\nSum [0..%d]\t\t = %d", num, sum);
    System.out.printf("\nSum of even [0..%d]\t = %d", num, evenSum);
    System.out.printf("\nSum of odd [0..%d]\t = %d\n", num, oddSum);

    is.close();
  }
}
