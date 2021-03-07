package ChapterTwo;

import java.util.Scanner;

public class diameterCircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input radius ");
        int radius = input.nextInt();

        System.out.printf(" Diameter is: %.4f Circumference is: %.4f Area is %.4f%n", 2.0 * radius,
                (2.0 *Math.PI) * radius, Math.PI * (radius * radius));
    }
}
