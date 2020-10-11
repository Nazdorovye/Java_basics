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
 * This class is associated with the fifth task of the second seminar
 */
public class Task0205 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    float hoursWorked = 0.f;

    while (true) {
      System.out.print("Type in number of hours worked -> ");

      if (is.hasNextFloat()) {
        hoursWorked = is.nextFloat();
        if (hoursWorked > 0.f && hoursWorked <= 50.f)
          break;
      }

      System.out.println("Invalid input. Try again...\n");
      is.nextLine();
    }

    float salary = 0.f;

    if (hoursWorked <= 40.f) salary = hoursWorked * 4.f;
    else salary = 160.f + 6.f * Math.abs(40.f - hoursWorked);

    System.out.printf("Your salary is: %.2f\n", salary);

    is.close();
  }
}
