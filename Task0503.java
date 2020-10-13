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
 * This class is associated with the third task of the fifth seminar
 */
public class Task0503 {
  public static float horsePower(float metricPower) {
    return metricPower * 1.36f;
  }
	
  public static float litresPerHundred(float engineVolume) {
    return (float)Math.sqrt((float)engineVolume * 0.067d);
  }
	
  public static float brakingDistance(float speed, boolean wet) {
    return (speed * speed) / (19.62f * ((wet) ? 0.55f : 0.75f));
  }
	
  public static void main(String args[]) {
    System.out.println("Audi A6: 132kw, 2698cm^3, 96 km/h, wet road:");
    System.out.printf("%.2fhp\t%.1fl/100km\t%.2fm\n", horsePower(132.f), litresPerHundred(2698.f),
        brakingDistance(96, true));
    System.out.println("VW Golf: 98kw, 1945cm^3, 110 km/h, dry road:");
    System.out.printf("%.2fhp\t%.1fl/100km\t%.2fm\n", horsePower(98.f), litresPerHundred(1945.f), 
        brakingDistance(110, false));
	}
}
