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

import java.util.Random;
  
 /**
 * This class is associated with the fifth task of the fifth seminar
 */
public class Task0505 {
  public static int[][] create2DArray(int[] rows, int colCount) {
    int[][] result = new int[rows.length][colCount];

    for (int row = 0; row < rows.length; row++) {
      for (int col = 0; col < colCount; col++) {
        result[row][col] = rows[row];
      }
    }

    return result;
  }

  public static void print(int[][] array) {
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[0].length; col++) {
        System.out.print(array[row][col] + " ");
      }

      System.out.print("\n");
    }
  }

  public static int sum2dArray(int[][] array) {
    int result = 0;

    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[0].length; col++) {
        result += array[row][col];
      }
    }

    return result;
  }

  public static int maxEl(int[][] array) {
    int max = array[0][0];

    for (int row = 0; row < array.length; row++)  {
      for (int col = 0; col < array[0].length; col++) {
        if (max < array[row][col]) {
          max = array[row][col];
        }
      }
    }

    return max;
  }

  public static int minEl(int[][] array) {
    int min = array[0][0];

    for (int row = 0; row < array.length; row++)  {
      for (int col = 0; col < array[0].length; col++) {
        if (min > array[row][col]) {
          min = array[row][col];
        }
      }
    }

    return min;
  }

  public static int averageEl(int[][] array) {
    return sum2dArray(array) / (array.length * array[0].length);
  }

  public static int[][] generate2DArray(int rows, int columns) {
    Random rn = new Random();
    int[][] result = new int[rows][columns];

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < columns; col++) {
        result[row][col] = rn.nextInt();
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[][] a1 = create2DArray(new int[] {1, 3, 5}, 5);
    System.out.println("create2DArray() :");
    print(a1);
    System.out.print("\n");

    System.out.printf("sum2dArray : %d\n", sum2dArray(a1));
    System.out.printf("averageEl : %d\n", averageEl(a1));
    System.out.printf("maxEl : %d\n", maxEl(a1));
    System.out.printf("minEl : %d\n\n", minEl(a1));

    int[][] a2 = generate2DArray(5, 4);
    System.out.println("generate2DArray() :");
    print(a2);
    System.out.print("\n");

    System.out.printf("sum2dArray : %d\n", sum2dArray(a2));
    System.out.printf("averageEl : %d\n", averageEl(a2));
    System.out.printf("maxEl : %d\n", maxEl(a2));
    System.out.printf("minEl : %d\n\n", minEl(a2));
  }
}