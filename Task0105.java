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
 * This class is associated with the fifth task of the first seminar
 */
public class Task0105 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int[] nums = new int[2];
    byte idx = 0;

    System.out.println("This app will take in two integers and output some calculations\n");

    while (idx < 2) {
      System.out.printf("Type in an integer #%d -> ", idx + 1);

      if (is.hasNextInt()) {
        nums[idx++] = is.nextInt();
      } else {
        System.out.println("Invalid input. Try again...\n");
      }
      
      is.nextLine();
    }

    System.out.printf("\n%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %.3f\nAvg = %.3f\n",
        nums[0], nums[1], nums[0] + nums[1],
        nums[0], nums[1], nums[0] - nums[1],
        nums[0], nums[1], nums[0] * nums[1],
        nums[0], nums[1], (float)nums[0] / (float)nums[1],
        (nums[0] + nums[1]) / 2.f);

    is.close();
  }
}
