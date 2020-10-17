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
 * This class is associated with the first task of task sequence to prepare for test 02
 */
public class PrepareForTest0201 {
  public static final int tgtArrayLength = 5;

  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int[] numArray = new int[tgtArrayLength];
    String choice = "f";
    int idx = 0;

    while (true) {
      if (!choice.matches("[yn]?")) {
        System.out.print("\nWould you like to type numbers tourself (y/n)." + 
            " If no, they will be randomized. -> ");
        choice = is.next().toLowerCase();

        if (!choice.matches("[yn]?")) {
          System.out.printf("Invalid argument. Try again...\n");
          is.nextLine();
          continue;
        }
      }
      
      if (choice.contentEquals("y")) {
        while (idx < tgtArrayLength) {
          System.out.printf("Type in integer for #%d -> ", idx + 1);

          if (is.hasNextInt()) {
            numArray[idx++] = is.nextInt();
          } else {
            System.out.println("Invalid input. Try again...\n");
          }

          is.nextLine();
        }
      } else {
        for (int i = 0; i < tgtArrayLength; i++ ) {
          //(int)(Math.random() * ((max - min) + 1) + min);
          numArray[i] = (int)(Math.random() * ((100 + 100) + 1)) - 100;
        }
      }

      break;
    }

    System.out.print("\nArray elements are:");

    long sum = 0;

    for (int i = 0; i < numArray.length; i++) {
      System.out.printf("%s%d", (i== 0) ? " " : ", ", numArray[i]);
      sum += numArray[i];
    }

    System.out.printf("\nMean of elements: %.3f", (float)sum / (float)numArray.length);
    System.out.print("\nRepeating elements:");
    sum = 0;

    for (int i = 0; i < numArray.length - 1; i++) {
      for (int j = i + 1; j < numArray.length; j++) {
        if (numArray[i] == numArray[j]) {
          System.out.printf("%s%d", (sum++ == 0) ? " " : ", ", numArray[i]);
          break;
        }
      }
    }

    if (sum == 0) {
      System.out.print(" none\n");
    } else {
      System.out.print("\n");
    }

    is.close();
  }
}
