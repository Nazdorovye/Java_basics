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
 * This class is associated with the fourth task of the first seminar
 */
public class Task0104 {
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);

    System.out.println("This app will take your name and will welcome you\n");

    System.out.print("Type in your name -> ");
    String name = is.nextLine();

    System.out.printf("Hello, %s!\n", name);

    is.close();
  }
}
