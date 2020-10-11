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
 * This class is associated with the first task of the second seminar
 */
public class Task0201 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);

    byte idx = 0;
    int[] nums = new int[2];

    while (idx < 2) {
      System.out.printf("Type in an integer #%d -> ", idx + 1);

      if (is.hasNextInt()) nums[idx++] = is.nextInt();
      else System.out.println("Invalid input. Try again...\n");
      
      is.nextLine();
    }

    if (nums[0] < nums[1]) System.out.printf("%d < %d\n", nums[0], nums[1]);
    else if (nums[0] > nums[1]) System.out.printf("%d > %d\n", nums[0], nums[1]);
    else System.out.printf("%d == %d\n", nums[0], nums[1]);

    is.close();
  }
}
