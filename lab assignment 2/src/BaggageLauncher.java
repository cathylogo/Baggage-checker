 /* Student Name: catherine logo
 * Student Number:041158107
 * Lab Professor:Narges Tabar
 * Due date :july 28 2024
 * Program Description: This program calculate the dimensions and the weight 
 * of the Baggage at the airport, and define if it's appropriate for a 
 * suitcase or a carry on. 
 */

import java.util.Scanner;

public class BaggageLauncher {

	public static void main(String[] args) {
		// I declare my parameters
		 double totalWeightOfValidBaggage = 0.0;
	        int numberOfValidItems = 0;
	        String continuePrompt;
	        
	        Scanner scanner= new Scanner(System.in);

	        System.out.println("Welcome to the Baggage Handler Software Program");

	        do {
	            System.out.print("Enter the length of the baggage (in cm): ");
	            int length = InputData.validateInt();

	            System.out.print("Enter the width (in cm): ");
	            int width = InputData.validateInt();

	            System.out.print("Enter the height(in cm): ");
	            int height = InputData.validateInt();

	            System.out.print("Enter the weight (in kg): ");
	            double weight = InputData.validateDouble();
	            
	            // instantiating a
	            //new Baggage object to hold the data for each piece of baggage entered
	            Baggage bag = new Baggage(length, width, height, weight);

	             if (BaggageChecker.sumDimensionsExceedsMax(bag)) {
	                System.out.println("This is oversized; it is not acceptable");
	            } else {
	                totalWeightOfValidBaggage += bag.getWeight();
	                numberOfValidItems++;
	                System.out.println(bag.toString());
	                double report = BaggageChecker.calculateWeightSurcharge(bag);
	                if (bag.getWeight() > BaggageChecker.MAX_REGULAR_WEIGHT)
	                System.out.printf("This bag is overweight; it exceeds the allowed weight of %.2f kg. A surcharge of $%.2f applies.%n",
	                		BaggageChecker.MAX_REGULAR_WEIGHT, report);
	            }
	            //prompts the
	            //user to continue until they enter “No”
	             continuePrompt = InputData.validateString("Do you wish to continue? "
	            		+ "Enter 'No' to quit, anything else to continue: ");
	        } while (!continuePrompt.equalsIgnoreCase("No"));

	        //output the total weight of valid baggage entered, the
	        //number of valid items entered, a message announcing that the program has terminated, and finally, the
	        //programmer’s name
	        System.out.printf("total number of valid bags entered was: %d%n", numberOfValidItems);
	        System.out.printf("Total weight entered was: %.2f kg%n", totalWeightOfValidBaggage);
	        System.out.println("The program has terminated.");
	        System.out.println("Program by Catherine Logo");
	    }
	}