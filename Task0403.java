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
 * This class is associated with the third task of the fourth seminar
 */
public class Task0403 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    float investAmount = 0.f;
    float interestRate = 0.f;
    int yearCount = 0;

    System.out.println("This calculates interest sum for each year of investment\n");

    for (int idx = 0; idx < 3;) {
      System.out.printf("Type in %s -> ", 
          (idx < 1) ? "investment amount" : (idx < 2) ? "interest rate" : "year count");

      
      if (idx == 0 && is.hasNextFloat()) {
        investAmount = is.nextFloat();

        if (investAmount > 0.f) {
          idx++;
        } else {
          System.out.println("Invalid input. Try again...\n");
        }
      } else if (idx == 1 && is.hasNextFloat()) {
        interestRate = is.nextFloat();

        if (interestRate > 0.f) {
          idx++;
        } else {
          System.out.println("Invalid input. Try again...\n");
        }
      } else if (idx == 2 && is.hasNextInt()) {
        yearCount = is.nextInt();

        if (yearCount > 0) {
          idx++;
        } else {
          System.out.println("Invalid input. Try again...\n");
        }
      } else {
        System.out.println("Invalid input. Try again...\n");
      }

      is.nextLine();
    }

    System.out.println("\nYear\tInterestSum\tSum");

    float[] yearAccum = new float[yearCount + 1];
    yearAccum[0] = investAmount;

    for (int year = 1; year <= yearCount; year++) {
      yearAccum[year] = yearAccum[year - 1] + yearAccum[year - 1] * interestRate / 100.f;

      System.out.printf("%d\t%g\t%.2f\n", 
          year, yearAccum[year - 1] * interestRate / 100.f, yearAccum[year]);
    }

    is.close();
  }
}
