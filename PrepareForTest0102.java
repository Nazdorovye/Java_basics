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
 * This class is associated with the second task of task sequence to prepare for test 01
 */
public class PrepareForTest0102 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    
    System.out.println("This app takes in range start & end and finds if 5 numbers are in range\n");
    
    int[] intervalBounds = new int[2];
    byte idx = 0;

    while (idx < 2) {
      System.out.printf("Type in integer for interval %s -> ", (idx == 0) ? "start" : "end");

      if (is.hasNextInt()) {
        intervalBounds[idx++] = is.nextInt();

        if (intervalBounds[0] > intervalBounds[1]) {
          int temp = intervalBounds[0];
          intervalBounds[0] = intervalBounds[1];
          intervalBounds[1] = temp;
        }
      } else {
        System.out.println("Invalid input. Try again...\n");
      }
      
      is.nextLine();
    }

    int[] userNumbers = new int[5];
    idx = 0;

    while (idx < 5) {
      System.out.printf("Type in integer for #%d -> ", idx + 1);

      if (is.hasNextInt()) {
        userNumbers[idx++] = is.nextInt();
      } else {
        System.out.println("Invalid input. Try again...\n");
      }
      
      is.nextLine();
    }

    System.out.printf("Numbers in range [%d..%d] are:", intervalBounds[0], intervalBounds[1]);
    idx = 0;

    for (int j = 0; idx < 5; idx++) {
      if (userNumbers[idx] >= intervalBounds[0] && userNumbers[idx] <= intervalBounds[1]) {
        System.out.printf("%s%d", (j++ != 0) ? ", " : " ", userNumbers[idx]);
      }
    }
    System.out.print("\n");
   
    is.close();
  }
}
