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
 * This class is associated with the fifth task of the third seminar
 */
public class Task0305 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int[] nums = new int[2];
    byte idx = 0;

    System.out.println("This app will take in x, y, and calculate product of elements between\n");

    while (idx < 2) {
      System.out.printf("Type in integer for #%d -> ", idx + 1);

      if (is.hasNextInt()) {
        nums[idx++] = is.nextInt();
      } else {
        System.out.println("Invalid input. Try again...\n");
      }
      
      is.nextLine();
    }

    if (nums[0] > nums[1]) {
      int temp = nums[0];
      nums[0] = nums[1];
      nums[1] = temp;
    }

    long prod = nums[0];

    for (int i = nums[0] + 1; i <= nums[1]; i++) {
      if (i == 0) { //in case x and y have opposing signs
        continue;
      }

      prod *= i;
    }

    System.out.printf("\nProduct of elements between [%d..%d] is %d\n", nums[0], nums[1], prod);

    is.close();
  }
}
