/*Andrew Hage
 * 10/25/2022
 * Module 2.3 Foot to Meter Conversion
 * SDEV200
 */

import java.util.Scanner;

public class Foot_Meter_Conversion {
	public static void main(String[] args) {
		try (// Create a Scanner object
		Scanner input = new Scanner(System.in)) {
			// Create constant value
			final double METERS_PER_FOOT = 0.305;

			// Prompt user to enter a number in feet
			System.out.print("Enter a value for feet: ");
			double feet = input.nextDouble();

			// Convert feet into meters
			double meters = feet * METERS_PER_FOOT;

			// Display results
			System.out.println(feet + " feet is " + meters + " meters");
		}
	}
}
