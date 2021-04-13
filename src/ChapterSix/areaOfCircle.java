package ChapterSix;

import java.util.Scanner;

public class areaOfCircle {
    public  static void circleArea(double radius){
       double areaOfCircle = Math.PI * (radius * radius);
        System.out.println ("Area of a Circle With radius " + radius + " is " + areaOfCircle);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.print ("Enter Radius: ");
        double radius = input.nextInt ();
        circleArea ( radius );
    }
}
