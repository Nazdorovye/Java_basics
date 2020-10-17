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

import java.util.Arrays;

/**
 * This class is associated with the third task of task sequence to prepare for test 02
 */
public class PrepareForTest0203 {
  private static boolean[] cardInDeck = new boolean[52];
  private static String[] cards = {
    "2 of Hearts",  "2 of Diamonds",  "2 of Clubs",  "2 of Spades",
    "3 of Hearts",  "3 of Diamonds",  "3 of Clubs",  "3 of Spades",
    "4 of Hearts",  "4 of Diamonds",  "4 of Clubs",  "4 of Spades",
    "5 of Hearts",  "5 of Diamonds",  "5 of Clubs",  "5 of Spades",
    "6 of Hearts",  "6 of Diamonds",  "6 of Clubs",  "6 of Spades",
    "7 of Hearts",  "7 of Diamonds",  "7 of Clubs",  "7 of Spades",
    "8 of Hearts",  "8 of Diamonds",  "8 of Clubs",  "8 of Spades",
    "9 of Hearts",  "9 of Diamonds",  "9 of Clubs",  "9 of Spades",
    "10 of Hearts", "10 of Diamonds", "10 of Clubs", "10 of Spades",
    "J of Hearts",  "J of Diamonds",  "J of Clubs",  "J of Spades",
    "Q of Hearts",  "Q of Diamonds",  "Q of Clubs",  "Q of Spades",
    "K of Hearts",  "K of Diamonds",  "K of Clubs",  "K of Spades",
    "A of Hearts",  "A of Diamonds",  "A of Clubs",  "A of Spades"
  };
  private static int lastIndex = 0;

  private static int genCard() {
    int r = 0;
    int s = 0;

    if (lastIndex == 52) {
      return -1;
    }

    //(int)(Math.random() * ((max - min) + 1) + min);
    while (true) {
      r = (int)(Math.random() * 13);
      s = (int)(Math.random() * 4);

      if (!cardInDeck[r * 4 + s]) {
        continue;
      }

      break;
    }

    lastIndex++;
    return r * 4 + s;
  }

  public static void main(String[] args) {
    Arrays.fill(cardInDeck, Boolean.TRUE);

    for (int i = 0, j = 0; i < 100; i++) {
      j = genCard();

      if (j > -1) {
        System.out.println(i+1 + ": " + cards[j]);
      } else {
        System.out.println("No cards left in the deck!");
      }
    }
  }
}
