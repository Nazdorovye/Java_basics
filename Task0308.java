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
 * This class is associated with the eighth task of the third seminar
 */
public class Task0308 {
  public static float USD = 1.1890f;
  public static float GBP = 0.9174f;
  public static float PLN = 4.2361f;
  public static float SEK = 9.4690f;

  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    boolean askAction = false;
    float sum = 0.f;
    String action = "";

    System.out.println("This app will take EUR amount and convert it to another currency\n");

    while (true) {
      if (!askAction) {
        System.out.print("Type an amount in EUR to convert -> ");

        if (is.hasNextFloat()) {
          sum = is.nextFloat();

          if (sum > 0) {
            askAction = true;
            continue;
          }
        }

        System.out.println("Invalid input. Try again...\n");
        is.nextLine();
        continue;
      }
      
      System.out.print("Select currency to convert to: (USD, GBP, PLN, SEK) -> ");
      action = is.next();
      
      switch (action.toLowerCase()) {
        case "usd":
          System.out.printf("\n%.2f EUR = %.2f USD\n", sum, sum * USD);
          break;
        case "gbp":
          System.out.printf("\n%.2f EUR = %.2f GBP\n", sum, sum * GBP);
          break;
        case "pln":
          System.out.printf("\n%.2f EUR = %.2f PLN\n", sum, sum * PLN);
          break;
        case "sek":
          System.out.printf("\n%.2f EUR = %.2f SEK\n", sum, sum * SEK);
          break;
        default:
          System.out.println("Invalid input. Try again...\n");
          continue;
      }

      System.out.print("\nRetry? (yY - yes) -> ");
      action = is.next();
      
      if (action.toLowerCase() == "y") {
        askAction = false;
        continue;
      }
      
      break;
    }

    is.close();
  }
}
