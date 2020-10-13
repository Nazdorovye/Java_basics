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
 * This class is associated with the sixth task of the fifth seminar
 */
public class Task0506 {
  public static int gcd(int m, int n) {
    if (n == 0) return m;

    int r;
    while (n != 0) {
      r = m % n;
      m = n;
      n = r;
    }

    return m;
  } 

  public static void main(String args[]) {
    System.out.printf("GDC(0, 1) = %d\n", gcd(0, 1));
    System.out.printf("GDC(1, 0) = %d\n", gcd(1, 0));
    System.out.printf("GDC(10, 500) = %d\n", gcd(10, 500));
    System.out.printf("GDC(354, 420) = %d\n", gcd(354, 420));
  }
}