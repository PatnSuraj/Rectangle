/**
 * Name:- Anantha Suraj Patnaikuni
 * Banner:- B00845171
 * Course:- CSCI 2110 Data Structures and Algorithms
 * Lab-1
 * Professor:- Dr. Srini Sampalli
 * Description:- The purpose of the code is to check whether the given two rectangles are overlapping or touching each other through some methods
 */
import java.util.Scanner;

// Exercise1 class
public class Exercise1 {

    // Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Number of tests cases
        int n_test = in.nextInt();

        int count = 0;
        // While loop to iterate the number of test case values for rectangle arguments
        while (count < n_test) {

            // Inputs of four arguments in loop for iterating "n_test" number of times
            double xpos = in.nextDouble();
            double ypos = in.nextDouble();
            double width = in.nextDouble();
            double height = in.nextDouble();

            // Rectangle 1 object
            Rectangle Rect_1 = new Rectangle(xpos, ypos, width, height);
            System.out.println("\n\nThe first Rectangle's top corner is: " + xpos + ", " + ypos);
            System.out.println("It's width is: " + width);
            System.out.println("It's height is: " + height);

            double xpos_2 = in.nextDouble();
            double ypos_2 = in.nextDouble();
            double width_2 = in.nextDouble();
            double height_2 = in.nextDouble();
            // Rectangle 2 object
            Rectangle Rect_2 = new Rectangle(xpos_2, ypos_2, width_2, height_2);
            System.out.println("\nThe second Rectangle's top corner is: " + xpos_2 + ", " + ypos_2);
            System.out.println("It's width is: " + width_2);
            System.out.println("It's height is: " + height_2);

            // Contains and touches method with boolean value return type
            System.out.println("\nThe 'contains' method returns: " + Rect_1.contains(Rect_2));
            System.out.println("The 'touches' method returns: " + Rect_2.touches(Rect_1));
            count++;
        }
    }
}

