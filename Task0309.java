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
 * This class is associated with the ninth task of the third seminar
 */
public class Task0309 {
  public static int FactorialFor(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++)
			result *= i;
		
		return result;
  }

  public static int FactorialWhile(int n) {
		int result = 1;
		
		int i = 1;
		while (i <= n)
			result *= i++;
		
		return result;
	}
	
	public static int FactorialDoWhile(int n) {
		int result = 1;
		
		int i = 1;
		do result *= i++;
		while (i <= n);
		
		return result;
	}
  
  public static void main(String[] args) {
    int n = 8;

    System.out.println("This app will print factorials for [1..8] using different loops\n");
    
    System.out.println("for-loop:\nn\tn!");
    for (int i = 1; i <= n; i++) {
      System.out.printf("%d\t%d\n", i, FactorialFor(i));
    }

    System.out.println("\nwhile-loop:\nn\tn!");
    for (int i = 1; i <= n; i++) {
      System.out.printf("%d\t%d\n", i, FactorialWhile(i));
    }

    System.out.println("\ndo-while-loop:\nn\tn!");
    for (int i = 1; i <= n; i++) {
      System.out.printf("%d\t%d\n", i, FactorialDoWhile(i));
    }
  }
}
