import java.util.Scanner;

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

/**
 * This class is associated with the third task of task sequence to prepare for test 01
 */
public class PrepareForTest0103 {
  public static final int multTableWidh = 10;

  public static void main(String[] args) {
    // TASK 01
    System.out.print("\n\nTwo-digit numbers divisible by 4:");

    for (int i = 10, j = 0; i < 100; i++) {
      if (i % 4 == 0) {
        System.out.printf("%s%d", (j++ != 0) ? ", " : " ", i);
      }
    }

    // TASK 02
    System.out.print("\n\nMultiplication table:\n");

    for (int row = -1; row < 11; row++) {
      for (int col = 0; col < 11; col++) {
        if (row == -1) {
          System.out.printf("%s%s",
              (col == 0) ? "" : "\t", (col == 0) ? "  " : String.format("%02d", col));
        } else if (row == 0) {
          System.out.print("--------");
        } else {
          System.out.printf("%s%02d%s", 
              (col == 0) ? "" : "\t", (col != 0) ? row * col : row, (col == 0) ? "|" : "");
        }
      }
      System.out.print("\n");
    }

    // TASK 03
    Scanner is = new Scanner(System.in);
    int c = 0;

    while (true) {
      System.out.print("\nType in c for a^2 + b^2 = c^2 -> ");
      if (is.hasNextInt()) {
        c = is.nextInt();
        c = Math.abs(c);
        break;
      }
      System.out.print("Invalid input. Try again...\n");
      is.nextLine();
    }

    int sqC = c * c;

    System.out.printf("\n0^2 + %d^2 = %d^2\n", c, c);
    System.out.printf("%d^2 + 0^2 = %d^2\n", c, c);

    for (int a = 1; a < c; a++) {
      for (int b = 1; b < c; b++) {
        if (a * a + b * b - sqC == 0) {
          System.out.printf("%d^2 + %d^2 = %d^2\n", a, b, c);
        }
      }
    }

    // TASK 04
    is.nextLine();
    System.out.print("\nType in some text -> ");
    String[] words = is.nextLine().split(" ");

    System.out.printf("Word count: %d\n", words.length);

    is.close();
  }
}
