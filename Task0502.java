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
 * This class is associated with the second task of the fifth seminar
 */
public class Task0502 {
	public static long arraySum(int[] array) {
		long result = 0;

		for (int el : array) {
			result += el;
		}

		return result;
	}

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

    System.out.println("This app takes an array of ints and returns its element sum\n");

    while (true) {
      System.out.print("Type in space-separated integer array of 10. ");
      System.out.print("Invalid and excess items will be skipped\n-> ");
      numArray = extractIntegers(is.nextLine());
      
      if (numArray.length == 0) {
        System.out.println("Not even one integer was in array. Try again...\n");
        is.nextLine();
        continue;
      }

      break;
    }

    System.out.printf("\nSum of array is: %d\n", arraySum(numArray));

    is.close();
  }
}