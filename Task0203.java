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

import java.lang.Math;
import java.util.Scanner;

 /**
 * This class is associated with the third task of the second seminar
 */
public class Task0203 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    float radius = 0.f;
    String action = "";
    boolean askAction = false;

    while (true) {
      if (!askAction) {
        System.out.print("Type in a radius -> ");

        if (is.hasNextFloat()) radius = is.nextFloat();
        else {
          System.out.println("Invalid input. Try again...\n");
          is.nextLine();
          continue;
        }

        askAction = true;
      }
      
      System.out.print("Select option to calculate: circle area (aA); circumference (cC) -> ");
      action = is.next();
      
      switch (action.toLowerCase()) {
        case "a":
          System.out.printf("Circle R = %.3f, Area is: %.3f\n", 
                  radius, Math.PI * Math.pow(radius, 2.f));
          break;
        case "c":
          System.out.printf("Circle R = %.3f, Circumference is: %.3f\n", 
                  radius, Math.PI * radius + radius);
          break;
        default:
          System.out.println("Invalid input. Try again...\n");
          continue;
      }
      
      break;
    }

    is.close();
  }
}
