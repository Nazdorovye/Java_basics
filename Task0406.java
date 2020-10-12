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
 * This class is associated with the sixth task of the fourth seminar
 */
public class Task0406 {
  public static void main(String args[]) {		
		Scanner is = new Scanner(System.in);
		
		float[][] experimentResults = new float[3][4];
		float[] experimentAverages = new float[3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				while (true) {
					System.out.printf("Type in result #%d for experiment #%d: ", j+1, i+1);
					
					if (!is.hasNextFloat()) {
						System.out.println("Invalid entry. Press Enter to try again...");
						is.nextLine();
						continue;
					}
					
					experimentResults[i][j] = is.nextFloat();
					experimentAverages[i] += experimentResults[i][j];
					break;
				}
			}
		}
		
		for (int i = 0; i < 3; i++)
			System.out.printf("Avg result for experiment #%d: %.2f\n", i+1, experimentAverages[i] / 4);
		
      is.close();
	}
}
