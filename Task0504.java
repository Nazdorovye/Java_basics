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
 * This class is associated with the fourth task of the fifth seminar
 */
public class Task0504 {
  public static int[] calculateTime(int seconds) {
    int[] result = { seconds / 3600, (seconds % 3600) / 60, (seconds % 3600) % 60 };	
    return result;
  }

  public static int calculateSeconds(int[] time) {
		return (time[0] * 3600) + (time[1] * 60) + time[2];
  }
  
  public static int[] timeFromString(String string) {
    int[] result = { -1, -1, -1 };
    String[] idx = string.split(":");

    for (int i = 0; i < idx.length && i < 3; i++) {
      if (idx[i].matches((i == 0) ? "^[0-9]+$" : "^[0-9]{1,2}$")) {
        result[i] = Integer.parseInt(idx[i]);
      } else {
        break;
      }
    }

    result[1] += result[2] / 60;
    result[2] -= (result[2] / 60) * 60;

    result[0] += result[1] / 60;
    result[1] -= (result[1] / 60) * 60;

    return result;
  }

  public static void main(String[] args) {
    Scanner is = new Scanner(System.in);
    boolean askAction = true;
    boolean run = true;
    int[] time;
    int action = 0;
    int seconds = 0;

    System.out.println("This app will take EUR amount and convert it to another currency");

    while (run) {
      if (askAction) {
        System.out.print("\nSelect option (1) s > hh:mm:ss ; (2) hh:mm:ss > s -> ");

        if (is.hasNextInt()) {
          action = is.nextInt();

          if (action > 0 && action < 3) {
            askAction = false;
            continue;
          }
        }

        System.out.println("Invalid input. Try again...\n");
        is.nextLine();
        continue;
      }
      
      if (action == 1) {
        System.out.print("Type in seconds -> ");

        if (is.hasNextInt()) {
          seconds = is.nextInt();

          if (seconds >= 0) {
            time = calculateTime(seconds);

            System.out.printf("%d seconds is %02d:%02d:%02d\n", 
                seconds, time[0], time[1], time[2]);

            action = 0;
            continue;
          }
        }

        System.out.println("Invalid input. Try again...\n");
        is.nextLine();
        continue;

      } else if (action == 2) {
        System.out.print("Type in time in hh:mm:ss format -> ");
        is.nextLine();
        time = timeFromString(is.nextLine());

        if (time[0] != -1 && time[1] != -1 && time[2] != -1) {
          System.out.printf("%02d:%02d:%02d is %d seconds\n", 
              time[0], time[1], time[2], calculateSeconds(time));

          action = 0;
          continue;
        }

        System.out.println("Invalid input. Try again...\n");
        is.nextLine();
        continue;
      }

      String ans;
      boolean question = true;
      while (question) {
        System.out.print("Repeat? Y/y -yes, N/n -no: ");
        ans = is.next();

        switch (ans.toLowerCase()) {
        case "y": 
          question = false;
          askAction = true;
          break;
        case "n": 
          run = question = false; 
          break;
        default: 
          System.out.println("Invalid input. Try again...\n");
          is.nextLine();
        }
      }
    }

    is.close();
  }
}
