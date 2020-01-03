import java.util.Scanner;

public class vacationDecisions {

public static void Main(String args[]) {
	
	//Deliverable 1 - Prework
	
		String vacationType;
		int groupSize;
		String vacationDest = "";
		String travelMethod = "";
		String result;
		
		Scanner scn = new Scanner(System.in);
		String userChoice = "";
		
		System.out.println("Would you like to use our vacation recommending tool?");
		userChoice = scn.nextLine();
		
		while (userChoice.equalsIgnoreCase("y")) {
			System.out.print("What kind of trip would you like to go on, musical, tropical, or adventurous?");
			vacationType = scn.next();
			System.out.print("How many are in your group?");
			groupSize = scn.nextInt();
			
			if (vacationType.equalsIgnoreCase("musical")) {
				vacationDest = "New Orleans";
			}
			else if (vacationType.equalsIgnoreCase("tropical")) {
				vacationDest = "beach vacation in Mexico";
			}
			else if (vacationType.equalsIgnoreCase("adventurous")) {
				vacationDest = "whitewater rafting the Grand Canyon";
			}
			
			if ((groupSize > 0) && (groupSize < 3)) {
				travelMethod = "first class";
			}
			else if (groupSize < 6) {
				travelMethod = "helicopter";
			}
			else if (groupSize > 5) {
				travelMethod = "charter flight";
			}
			
			result = travelMethod + " to " + vacationDest + ".";
			
			System.out.println("Since you're a group of " + groupSize + " going on a " + vacationType + " vacation, you should take a " + result);
			
			System.out.print("Would you like to continue to use our vacation recommending tool?");
			userChoice = scn.next();			
		}
		
		System.out.println("Thank you, goodbye.");

	}
}
