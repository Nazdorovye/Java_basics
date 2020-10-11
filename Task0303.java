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
 * This class is associated with the third task of the third seminar
 */
public class Task0303 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int[] nums = new int[2];
    byte idx = 0;

    System.out.println("This app will take in n, x and output n^x\n");

    while (idx < 2) {
      System.out.printf("Type in integer for %s -> ", (idx == 0) ? "n" : "x");

      if (is.hasNextInt()) {
        nums[idx++] = is.nextInt();
      } else {
        System.out.println("Invalid input. Try again...\n");
      }
      
      is.nextLine();
    }

    if (nums[1] == 0) {
      System.out.printf("\n%d^%d = %d\n", nums[0], nums[1], 1);
    } else if (nums[1] > 0) {
        long result = nums[0];

        for (int i = 1; i < nums[1]; i++) {
          result *= nums[0];
        }

        System.out.printf("\n%d^%d = %d\n", nums[0], nums[1], result);
    } else {
        double result = nums[0];

        for (int i = -1; i > nums[1]; i--) {
          result *= nums[0];
        }

        System.out.printf("\n%d^%d = %g\n", nums[0], nums[1], 1.f / result);
    }

    is.close();
  }
}
