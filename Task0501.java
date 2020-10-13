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
 * This class is associated with the first task of the fifth seminar
 */
public class Task0501 {
  public static long multiply(int a, int b) {
    return a * b;
  }
  
  public static float divide(int a, int b) {
    if (b == 0) {
      System.out.println("Division by 0! Returning 0.");
      return 0;
    }

    return (float)a / (float)b;
  }

  public static void main(String args[]) {
    Scanner is = new Scanner(System.in);
    int[] nums = new int[2];
    byte idx = 0;

    System.out.println("This app will take in a, b and multiply, divide them using functions\n");

    while (idx < 2) {
      System.out.printf("Type in integer #%d -> ", idx + 1);

      if (is.hasNextInt()) {
        nums[idx++] = is.nextInt();
      } else {
        System.out.println("Invalid input. Try again...\n");
      }
      
      is.nextLine();
    }

    System.out.printf("\n%d * %d = %d\n", nums[0], nums[1], multiply(nums[0], nums[1]));
    System.out.printf("%d / %d = %.2f\n", nums[0], nums[1], divide(nums[0], nums[1]));

    is.close();
  }
}