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
 * This class is associated with the third task of the first seminar
 */

public class Task0103 {
  public static void main(String[] args) {
    int a = 9;
    int b = 5;
    int sum = a + b;
    int dif = a - b;
    int prod = a * b;
    float quot = (float)a / (float)b;
    float avg = (float)sum / 2.f;
    int remain = a % b;

    System.out.printf("a = %d, b = %d\na + b = %d\na - b = %d\na * b = %d\na / b = %.2f\nAverage" +
        " = %.2f\na %% b = %d", a, b, sum, dif, prod, quot, avg, remain);
  }
}
