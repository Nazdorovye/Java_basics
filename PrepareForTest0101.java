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

import java.lang.Math;
import java.util.Scanner;

/**
 * This class is associated with the first task of task sequence to prepare for test 01
 */
public class PrepareForTest0101 {
  private static final int lowBoundary = -10;
  private static final int highBoundary = 10;
  private static final int targetLength = 8;


  public static int[] extractIntegers(String string) {
    String[] items = string.split(" ");
    int parsedInt = 0;
    int arrayIndex = 0;

    for (int i = 0; arrayIndex < targetLength && i < items.length; i++) {      
      if (items[i].matches("-?\\d+")) {
        parsedInt = Integer.parseInt(items[i]);

        if (parsedInt >= lowBoundary && parsedInt <= highBoundary) {
          arrayIndex++;
        }
      } 
    }

    int[] numbers = new int[arrayIndex];
    arrayIndex = 0;

    for (int i = 0; arrayIndex < targetLength && i < items.length; i++) {      
      if (items[i].matches("-?\\d+")) {
        parsedInt = Integer.parseInt(items[i]);

        if (parsedInt >= lowBoundary && parsedInt <= highBoundary) {
          numbers[arrayIndex++] = parsedInt;
        }
      } 
    }

    return numbers;
  }
  
  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    int[] numArray;
    
    int sum = 0;
    float mean;
    int oddCount = 0;
    int evenCount = 0;
    int oddSum = 0;
    int evenSum = 0;
    int posCount = 0;
    int smallest;
    int largest;
    
    System.out.printf("This app takes an array of ints [%d..%d] and does some calculations\n\n",
    lowBoundary, highBoundary);
    
    while (true) {
      System.out.printf("Type in space-separated integer array with at least %d valid elements." +
      "Invalid items will be skipped\n-> ", targetLength);
      numArray = extractIntegers(is.nextLine());
      
      if (numArray.length != targetLength) {
        System.out.printf("Insufficient element count (%d). Try again...\n\n", numArray.length);
        is.nextLine();
        continue;
      }
      
      System.out.print("\nElement array is:");
      
      smallest = numArray[0];
      largest = numArray[0];
      
      for (int i = 0; i < targetLength; i++) {
        System.out.printf("%s%d", (i != 0) ? ", " : " " , numArray[i]);

        sum += numArray[i];

        if (numArray[i] % 2 == 0) {
          evenSum += numArray[i];
          evenCount++;
        } else {
          oddSum += numArray[i];
          oddCount++;
        }

        if (numArray[i] > -1) {
          posCount++;
        }

        if (numArray[i] > largest) {
          largest = numArray[i];
        }

        if (numArray[i] < smallest) {
          smallest = numArray[i];
        }
      }
      
      break;
    }
    
    System.out.printf("\nSum of elements is: %d\n", sum);

    mean = (float)sum / (float)numArray.length;
    System.out.printf("Mean of elements is: %.3f\n", mean);

    System.out.printf("Sum of even elements (%d pcs) is: %d\n", evenCount, evenSum);
    System.out.printf("Sum of odd elements (%d pcs) is: %d\n", oddCount, oddSum);
    System.out.printf("Positive element count: %d\n", posCount);
    System.out.printf("Negative element count: %d\n", targetLength - posCount);
    System.out.print("Elements that are square:");

    int smallerThanMean = 0;
    int largerThanMean = 0;

    for (int i = 0, j = 0; i < targetLength; i++) {
      if (numArray[i] > mean) {
        smallerThanMean++;
      } else if (numArray[i] < mean) {
        largerThanMean++;
      }

      if (Math.sqrt(numArray[i]) % 1 == 0) {
        System.out.printf("%s%d", (j++ != 0) ? ", " : " " , numArray[i]);
      }
    }

    System.out.printf("\nCount of elements smaller than mean: %d\n", smallerThanMean);
    System.out.printf("Count of elements larger than mean: %d\n", largerThanMean);        
    System.out.printf("Smallest element: %d\n", smallest);
    System.out.printf("Largest element: %d\n", largest);

    System.out.print("Elements that are divisible by 7:");

    for (int i = 0, j = 0; i < targetLength; i++) {
      if (numArray[i] % 7 == 0) {
        System.out.printf("%s%d", (j++ != 0) ? ", " : " " , numArray[i]);
      }
    }

    System.out.print("\nElements with tailing zeros:");

    for (int i = 0, j = 0; i < targetLength; i++) {
      if (numArray[i] % 10 == 0 || numArray[i] == 0) {
        System.out.printf("%s%d", (j++ != 0) ? ", " : " " , numArray[i]);
      }
    }

    System.out.println("\nElements in two rows:");

    for (int i = 0; i < targetLength; i += 2) { 
      System.out.printf("%s%d", (i != 0) ? ", " : " " , numArray[i]);
    }
    System.out.print("\n");

    for (int i = 1; i < targetLength; i += 2) {
      System.out.printf("%s%d", (i != 1) ? ", " : " " , numArray[i]);
    }
    System.out.print("\n");

    is.close();
  }
}