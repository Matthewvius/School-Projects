import java.util.Scanner;
// importing scanner
public class SandwichShop {
	// naming public class
	public static void main (String args[]) {
		// establishing a main method to work from
		String anotherSandwich = new String ();
		// declaring this string for a a do/while loop to repeat the ordering process
		do {
		Scanner input = new Scanner(System.in);
		double cost = 0;
		System.out.printf("Select a sandwich base:\nTurkey - 4.95 \nRoast Beef - 6.95 \nTuna - 3.49 \nVeggie - 4.25");
		System.out.printf("\nPress 1 for Turkey, 2 for Roast Beef, 3 for Tuna, or 4 for Veggie: ");
		int sandBase = input.nextInt();
		String sandType = " ";
		// prompting the user to enter their sandwich base, and establishing another string for the output
		if (sandBase < 1 || sandBase > 4) {
			System.out.println("Invalid input.");
		}
		else if (sandBase == 1) {
			cost += 4.95;
			sandType = "Turkey (4.95)";
		} else if (sandBase == 2) {
			cost += 6.95;
			sandType = "Roast Beef (6.95)";
		} else if (sandBase == 3) {
			cost += 3.49;
			sandType = "Tuna (3.49)";
		} else if (sandBase == 4) {
			cost += 4.25;
			sandType = "Veggie (4.25)";
		}
		// if else statement adds the price of any given base to the total cost so far
		System.out.printf("\nSelect sandwich options: \nLettuce - 0.00\nTomatoes - 0.75\nOnion - 0.25\nCheese - 1.50");
		System.out.printf("\nPress 1 for Lettuce, 2 for Tomatoes, 3 for Onion, and 4 for Cheese. Press 0 when done:  ");
		int sandOps = input.nextInt();
		String op1 = "";
		String op2 = "";
		String op3 = "";
		String op4 = "";
		while (sandOps != 0) {
			if (sandOps > 4 || sandOps < 0) {
				System.out.printf("\nInvalid input.");
			} else {
				switch (sandOps) {
					case 1: cost = cost + 0;
					op1 = "Lettuce (0.00)";
					break;
					case 2: cost = cost + 0.75;
					op2 = "Tomatoes (0.75)";
					break;
					case 3: cost = cost + 0.25;
					op3 = "Onion (0.25)";
					break;
					case 4: cost = cost + 1.50;
					op4 = "Cheese (1.50)";
					break;
				}
				sandOps = input.nextInt();
			}
		}
		// while loop encasing a switch that adds options to the sandwich as necessary until the user is done, then adds that cost to the total
		System.out.printf("\nRolls (Choose only one): \nRye - 0.25 \nWhite - 0.00 \nWheat - 0.00 \nHard Roll - 0.50");
		System.out.printf("\nPress 1 for Rye, 2 for White, 3 for Wheat, or 4 for Hard Roll: ");
		int sandBread = input.nextInt();
		if (sandBread == 1) {
			cost += 0.25;
		} else if (sandBread == 2 || sandBread == 3) {
			cost += 0;
		} else if (sandBread == 4) {
			cost += 0.50;
		} else {
			System.out.println("Invalid input.");
		}
		// if else statement adds the cost of the bread to the cost so far
		System.out.printf("\nHow many sandwiches would you like? Enter a number: ");
		int sandNum = input.nextInt();
		double totalCost = sandNum * cost;
		double bulkDiscount = totalCost * 0.05;
		double clubDiscount = totalCost * 0.10;
		if (sandNum > 10) {
			totalCost -= bulkDiscount;
		}
		System.out.printf("\nPress 1 if you're a member of the club, or 0 if not: ");
		int membership = input.nextInt();
		if (membership == 1){
			totalCost -= clubDiscount;
		}
		System.out.printf("\nPress 1 for Delivery or 0 for Pickup: ");
		int delivery = input.nextInt();
		if (delivery == 1) {
			totalCost += 2.50;
		}
		double tax = totalCost * 0.07;
		double grandTotal = totalCost + tax;
		// applying discounts, calculating tax, total, quantity
		System.out.printf("\n CSC161 Sandwiches \nQuantity: " + sandNum + "\nSandwich Type: " + sandType + "\nOptions: ");
		System.out.printf("\n" + op1 + "\n" + op2 + "\n" + op3 + "\n" + op4);
		System.out.printf("\nDelivery - 2.50");
		System.out.printf("\nSub Total - %.2f", totalCost); 
		System.out.printf("\nTax - %.2f", tax);
		System.out.printf("\nTotal due - %.2f", grandTotal);
		System.out.printf("\nOrder again? Yes or No: ");
		// output concluding with a request to the user to either order again or exit the program
		input.nextLine();
		anotherSandwich = input.nextLine();
		} while (anotherSandwich.equalsIgnoreCase("yes"));
		// calls back the string established at the very beginning to potentially begin the process over
		System.out.printf("\nThanks for ordering! Goodbye.");
	}
}