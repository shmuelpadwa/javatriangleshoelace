/*note: I used the shoelace theorem instead of herons formula. Both work though*/

import java.lang.Math;
import java.util.Scanner;

public class Pointtest{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter point a's x coordinate: ");
    double ax = kb.nextDouble();
    System.out.println("Enter point a's y coordinate: ");
    double ay = kb.nextDouble();
    System.out.println("Enter point b's x coordinate: ");
    double bx = kb.nextDouble();
    System.out.println("Enter point b's y coordinate: ");
    double by = kb.nextDouble();
    System.out.println("Enter point c's x coordinate: ");
    double cx = kb.nextDouble();
    System.out.println("Enter point c's y coordinate: ");
    double cy = kb.nextDouble();
    Point a = new Point(ax, ay);
    Point b = new Point(bx, by);
    Point c = new Point(cx, cy);
    double Term1 = (a.getXcoordinate() * b.getYcoordinate()) + (b.getXcoordinate() * c.getYcoordinate()) + (c.getXcoordinate() * a.getYcoordinate());
    double Term2 = (b.getXcoordinate() * a.getYcoordinate()) + (c.getXcoordinate() * b.getYcoordinate()) + (a.getXcoordinate() * c.getYcoordinate());
    double Term3 = Term1 - Term2;
    double Term4 = Term3 / 2;
    double Term5 = Math.abs(Term4);
    System.out.println("the area is " + Term5);
  }
}