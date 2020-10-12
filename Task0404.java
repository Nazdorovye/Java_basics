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
 * This class is associated with the fourth task of the fourth seminar
 */
public class Task0404 {
  private static final int arrayLength = 10;

  public static int[] extractIntegers(String string, int trimTo) {
    String[] items = string.split(" ");
    int[] numbers = new int[trimTo];

    for (int i = 0, arrayIndex = 0; i < items.length && arrayIndex < trimTo; i++) {
      if (items[i].matches("-?\\d+")) {
        numbers[arrayIndex++] = Integer.parseInt(items[i]);
      } 
    }

    return numbers;
  }

  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);    
    int[] numArray;

    System.out.printf("This app takes an array of %d ints and searches for a number in it\n\n",
        arrayLength);

    while (true) {
      System.out.print("Type in space-separated integer array of 10. ");
      System.out.print("Invalid and excess items will be skipped\n-> ");
      numArray = extractIntegers(is.nextLine(), arrayLength);
      
      if (numArray.length != arrayLength) {
        System.out.println("Not enough elements. Try again...\n");
        is.nextLine();
        continue;
      }

      break;
    }

    int number = 0;

    while (true) {
      System.out.print("Type in number to search for in array -> ");
      
      if (is.hasNextInt()) {
        number = is.nextInt();
      } else {
        System.out.println("Invalid input. Try again...\n");
        is.nextLine();
        continue;
      }

      break;
    }

    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] == number) {
        for (; i < numArray.length - 1; i++) {
          numArray[i] = numArray[i+1];
        }

        numArray[i] = 0;
        break;
      } else if (i != numArray.length - 1){
        continue;
      }

      System.out.println("\nNumber was not found in the array!");
    }

    System.out.print("\nResulting array:");
    
    for (int el : numArray) {
      System.out.printf(" %d", el);
    }

    System.out.print("\n");

    is.close();
  }
}
