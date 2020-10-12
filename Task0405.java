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
 * This class is associated with the fifth task of the fourth seminar
 */
public class Task0405 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);    
    int n;

    System.out.println("This app calculates n-th number of Fibonacci sequence\n");

    while (true) {
      System.out.print("Type in n [0..92] -> ");
      
      if (is.hasNextInt()) {
        n = is.nextInt();

        if (n > -1 && n < 93) {
          break;
        }
      } 

      System.out.println("Invalid input. Try again...\n");
      is.nextLine();
    }

    long[] fib = { 0, 1 };
    boolean first = true;
    int idx = 2;

    for (int i = 2; i <= n; i++, first = !first) {
      idx = first ? 0 : 1;
      fib[idx] = fib[0] + fib[1];
    }
    
    System.out.printf("Fib(%d) = %d\n", n, (idx == 2) ? fib[n] : first ? fib[1] : fib[0]);

    is.close();
  }
}
