
/* Aim: (Practical.04)Find the method printName. Notice the comment lines showing where you should put
your code. This has a name passed into it with the format “<first name> <last name>”.
You will reformat it to be “<last name>, <first name> and print it out.
Example:“Bill Joy” becomes “Joy,Bill”
There will always be at least one space between the first and the last name. There may be
extra spaces between the first and last names and extra spaces at the beginning and end of
the name passed in. You will have to strip these out if they are there.
   Author: Ayushi Wankhade
   Version:4.0
   Date: 20/02/2024
*/
import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their full name
        System.out.println("Enter your full name (format: <first name> <last name>):");
        String fullName = scanner.nextLine();

        // Call the printName method to reformat and print the name
        printName(fullName);

        // Close the scanner
        scanner.close();
    }

    // Method to reformat and print the name
    private static void printName(String fullName) {
        // Split the full name into first name and last name using the space character
        // as a delimiter
        String[] nameParts = fullName.split(" ");

        // Check if the input has both first name and last name
        if (nameParts.length == 2) {
            // Extract the first name and last name
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            // Reformat the name as "last name, first name"
            String formattedName = lastName + "  " + firstName;

            // Print the reformatted name
            System.out.println("Reformatted Name: " + formattedName);
        } else {
            // Print an error message if the input format is incorrect
            System.out.println(
                    "Invalid input format. Please enter your full name in the format: <first name> <last name>");
        }
    }
}
