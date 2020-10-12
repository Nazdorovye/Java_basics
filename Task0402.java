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
 * This class is associated with the second task of the fourth seminar
 */
public class Task0402 {
  public static String stars(int count) {
    String result = "";

    for (; count > 0; count--) {
      result += "*";
    }

    return result;
  }

  public static void main(String[] args) {
    int[] array = { 19, 3, 15, 7, 11, 9, 13, 5, 1 };

    System.out.println("This app outputs predefined array element values and histogram\n");
    System.out.print("Element\tValue\tHistogram\n");

    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d\t%d\t%s\n", i, array[i], stars(array[i]));      
    }
  }
}
