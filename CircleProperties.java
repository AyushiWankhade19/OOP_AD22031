
/* Aim: PracticalNo.2
   Author: Ayushi Wankhade
   Version:2.0
   Date: 06/02/2024
*/
import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Check if radius is non-zero and positive
        if (radius <= 0) {
            System.out.println("Please enter a non-zero positive number.");
        } else {
            // Calculate perimeter and area
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;
            // Output results
            System.out.println("Perimeter of the circle: " + perimeter);
            System.out.println("Area of the circle: " + area);
        }

        scanner.close();
    }
}
