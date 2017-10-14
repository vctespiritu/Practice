import java.util.Scanner;

/**
 * 
 * @author Victor Espiritu
 * @since 2017/10/14
 * @version 1.0
 * 
 * Professor: 
 * James Burke COMI-1510-602 
 * Java Programming
 * 
 * This is a program that obtains hawk count data from the keyboard, in
 * a loop, until the user enters a sentinel value of -1. There are 5
 * types of hawks that the program is obtaining information for which
 * are Osprey, Bald Eagle, Cooper's Hawk, Red Shouldered Hawk, and
 * Red-Tailed Hawk. At the end, the program will display a table
 * with the hawk types, how many were seen on each of them,
 * and the percentage of overall hawk represented by each specie.
 *
 * Changes!
 *
 */

public class HawkCount {

	public static void main(String[] args) {

		// Constant var sentinel that user will enter 
		// to get results
		final int sentinel = -1;

		// Variables will hold 1. Species number (code) 
		// 2. Number of one type 
		// of specie seen. 3. Total hawk seen.
		int specieNum;
		int numberOfSpecie;
		double totalHawkSeen;

		// Variables of hawk types will amount the number 
		// of each specie seen
		int osprey = 0;
		int baldEagle = 0;
		int coopers = 0;
		int redShouldered = 0;
		int redTailed = 0;

		// Percentages of hawk overall represented by species
		double pctOsprey;
		double pctBaldEagle;
		double pctCoopers;
		double pctRedShouldered;
		double pctRedTailed;

		// Scanner to read input from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// Prompting user for specie code and holding it
		System.out.print("What species of hawk?\n"
				+ "1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, "
				+ "5 - Red-Tailed\nHawk, -1 to quit: ");
		specieNum = keyboard.nextInt();

		// Validating specie code in specieNum var
		while (specieNum != -1 && !(specieNum >= 1 && specieNum <= 5)) {
			System.out.println("That is an invalid hawk species.");

			// Changing user's input for a valid specie code
			System.out.print("What species of hawk?\n"
					+ "1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, "
					+ "5 - Red-Tailed\nHawk, -1 to quit: ");
			specieNum = keyboard.nextInt();

		}

		// While specie code is not -1
		while (specieNum != sentinel) {

			// Prompting for number of species seen
			System.out.print("How many were seen? ");
			numberOfSpecie = keyboard.nextInt();

			// Validating number of species var
			if (numberOfSpecie > 0) {

				// Adding the total of species seen to their corresponding
				// amounted variables
				switch (specieNum) {
				case 1:
					osprey += numberOfSpecie;
					break;
				case 2:
					baldEagle += numberOfSpecie;
					break;
				case 3:
					coopers += numberOfSpecie;
					break;
				case 4:
					redShouldered += numberOfSpecie;
					break;
				case 5:
					redTailed += numberOfSpecie;
					break;
				}
			} else {
				System.out.println("That is an invalid count.");
			}

			// Changing specieNum for a new specie code
			System.out.print("What species of hawk?\n"
					+ "1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, "
					+ "5 - Red-Tailed\nHawk, -1 to quit: ");
			specieNum = keyboard.nextInt();

			// Validating specie code in specieNum var inside the while loop
			while (specieNum != sentinel && !(specieNum >= 1 && specieNum <= 5)) {
				System.out.println("That is an invalid hawk species.");

				// Changing user's input for a valid specie code
				System.out.print("What species of hawk?\n"
						+ "1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, "
						+ "5 - Red-Tailed\nHawk, -1 to quit: ");
				specieNum = keyboard.nextInt();

			}

		}

		// Closing keyboard object. No longer needed for input
		keyboard.close();

		// Total of Hawks seen
		totalHawkSeen = (osprey + baldEagle + coopers + redShouldered + redTailed) * 1.0;

		// Percentage of overall hawks represented by species
		pctOsprey = (osprey / totalHawkSeen) * 100;
		pctBaldEagle = (baldEagle / totalHawkSeen) * 100;
		pctCoopers = (coopers / totalHawkSeen) * 100;
		pctRedShouldered = (redShouldered / totalHawkSeen) * 100;
		pctRedTailed = (redTailed / totalHawkSeen) * 100;

		// Printing results in table
		System.out.println("Species \t\tNumber \t\t\t% of Total");
		System.out.printf("Osprey%19d %28.2f%n", osprey, pctOsprey);
		System.out.printf("Bald Eagle%15d %28.2f%n", baldEagle, pctBaldEagle);
		System.out.printf("Coopers%18d %28.2f%n", coopers, pctCoopers);
		System.out.printf("Red Shouldered%11d %28.2f%n", redShouldered, pctRedShouldered);
		System.out.printf("Red Tailed%15d %28.2f%n", redTailed, pctRedTailed);

	}

}