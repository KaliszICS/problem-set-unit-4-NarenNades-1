/**
	* 	File: Problem Set: Unit 4
	* 	Author: Naren Nades
	*	Date Created: April 16, 2023
	*	Date Last Modified: April 27, 2026
	*/

import java.util.Random;
import java.util.Scanner;

public class ProblemSet {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		// Welcome!!
		System.out.println("\nWelcome to the High Low Guessing Game.\n");

		// Number of Rounds
		int rounds = -1;
		while (rounds <= 0) {
			System.out.print("Input a number of rounds to play: ");
			if (s.hasNextInt()) {
				rounds = s.nextInt();
				if (rounds <= 0) {
					System.out.println("Invalid Input!");
				}
			}
			else {
				s.nextLine();
				System.out.println("Invalid Input!");
			}
		}

		int i = 1;
		int answer = 0;
		boolean isInt;
		int score = 0;

		// Main Game Loop
		do {
			int num = r.nextInt(21);
			System.out.println("\nRound " + i + "\n");
			System.out.println("Please select High, Low or Even:");
			System.out.println("1. High (11 to 20)");
			System.out.println("2. Low (0 to 9)");
			System.out.println("3. Even(10)");
			isInt = s.hasNextInt();
			if (isInt == true) {
				answer = s.nextInt();
			}

			while (isInt == false || !(answer >= 1 && answer <=3)) { // Invalid Inputs
				System.out.println("\nInvalid Input!\n");
				s.nextLine();
				System.out.println("Please select High, Low or Even:");
				System.out.println("1. High (11 to 20)");
				System.out.println("2. Low (0 to 9)");
				System.out.println("3. Even(10)");
				isInt = s.hasNextInt();
				if (isInt == true) {
					answer = s.nextInt();
				}
			}

			// Checks if you are correct or not
			if (answer == 1 && (num <= 20 && num >= 11)) {
				System.out.println("The number was "+num+", You were correct.");
				score = score + 1;
				System.out.println("Current Score: " + score);
			}
			else if (answer == 2 && (num <= 9 && num >= 0)) {
				System.out.println("The number was "+num+", You were correct.");
				score = score + 1;
				System.out.println("Current Score: " + score);
			}
			else if (answer == 3 && (num == 10)) {
				System.out.println("The number was "+num+", You were correct.");
				score = score + 1;
				System.out.println("Current Score: " + score);
			}
			else {
				System.out.println("The number was "+num+", You were incorrect.");
				System.out.println("Current Score: " + score);
			}
			i = i+1;

		} while (i<=rounds);

		// Final Score
		System.out.println("\nTotal Score: "+ score);
		System.out.println("Congratulations you got "+score+" out of "+rounds+" rounds right!");
	
		s.close();
	}
}