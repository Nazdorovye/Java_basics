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
 * This class is associated with the second task of task sequence to prepare for test 02
 */
public class PrepareForTest0202 {
  public static boolean isPalindrome(String s) {
    String s1 = s.replaceAll("\\s+", "").toLowerCase(); // removes all spaces

    for (int i = 0; i <= s1.length() / 2; i ++) {
      if (s1.charAt(i) == s1.charAt(s1.length() - i - 1)) {
        continue;
      } else {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.printf("\nabba is %s palindrome\n", (isPalindrome("abba")) ? "" : "not");
    System.out.printf("123454321 is %s palindrome\n", (isPalindrome("123454321")) ? "" : "not");
    System.out.printf("Taco cat is %s palindrome\n", (isPalindrome("Taco cat")) ? "" : "not");
    System.out.printf("Borrow or rob is %s palindrome\n", 
        (isPalindrome("Borrow or rob")) ? "" : "not");
  }
}
