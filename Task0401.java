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
 * This class is associated with the first task of the fourth seminar
 */
public class Task0401 {
  public static int[] extractIntegers(String string) {
    String[] items = string.split(" ");
    int arrayIndex = 0;

    for (String item : items) {
      if (item.matches("-?\\d+")) {
        arrayIndex++;
      } 
    }

    int[] numbers = new int[arrayIndex];
    arrayIndex = 0;

    for (String item : items) {
      if (item.matches("-?\\d+")) {
        numbers[arrayIndex++] = Integer.parseInt(item);
      } 
    }

    return numbers;
  }

  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int[] numArray;

    System.out.println("This app takes an array of ints and does some calculations\n");

    while (true) {
      System.out.print("Type in space-separated integer array. Invalid items will be skipped\n-> ");
      numArray = extractIntegers(is.nextLine());
      
      if (numArray.length == 0) {
        System.out.println("Not one element was an integer. Try again...\n");
        is.nextLine();
        continue;
      }

      break;
    }

    long sum = 0;
    int largest = numArray[0];
    int smallest = numArray[0];

    System.out.print("\nReversed array:");
    for (int i = numArray.length - 1; i > -1; i--) {
      System.out.printf(" %d", numArray[i]);
      sum+= numArray[i];

      if (numArray[i] > largest) {
        largest = numArray[i];
      }
      
      if (numArray[i] < smallest) {
        smallest = numArray[i];
      }
    }

    System.out.printf("\nSum of array elements: %d", sum);
    System.out.printf("\nLargest element of array: %d", largest);
    System.out.printf("\nSmallest element of array: %d\n", smallest);

    is.close();
  }
}
