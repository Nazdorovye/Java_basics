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
 * This class is associated with the second task of the first seminar
 */
public class Task0102 {
  public static void main(String[] args) {
    int a = 5;
    float b = 9.99f;
    boolean c = true;
    char d = 'A';
    byte e = 127;
    byte f = (byte)129;
    char g = 65;
    short h = 300;
    byte i = (byte)h;
    long j = Long.MAX_VALUE;

    System.out.println("This app outputs some basic types\n");

    System.out.printf("a = %d\nb = %.2f\nc = %b\nd = %c\ne = %d\nf = %d\ng = %c\ni = %d\nj = %d\n",
        a, b, c, d, e, f, g, i, j);
  }
}