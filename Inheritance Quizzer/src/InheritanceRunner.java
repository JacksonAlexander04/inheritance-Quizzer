import java.util.Scanner;
import java.text.DecimalFormat;
public class InheritanceRunner {
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner UserIntInput = new Scanner(System.in);
	public static void main(String[] args) {
		int counter = 0;
		System.out.println("This is a program which will test you on your inheritance skills!");
		System.out.println();
		System.out.println("If this code runs: ");
		System.out.println("snipe x = new Sailboat();");
		System.out.println("x.capsize();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		int userChoice = UserIntInput.nextInt();
		
		if(userChoice == 5) {
			System.out.println("That was the right answer!  ====");
			counter++;
			System.out.println();
		}
		else {
			System.out.println("WRONG");
			System.out.println("It should have printed out:");
			System.out.println("ERROR");
			System.out.println();
		}
		System.out.println("If this code runs: ");
		System.out.println("Sailboat x = new Sailboat();");
		System.out.println("x.rigBoat();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 1) {
			System.out.println("That was the right answer!  ====");
			counter++;
			Sailboat x = new Sailboat();
			x.rigBoat();
			System.out.println();
			
		}
		else {
			System.out.println("WRONG");
			Sailboat x = new Sailboat();
			System.out.println("It should have printed out:");
			x.rigBoat();
			System.out.println();
			
		}
		
		System.out.println("If this code runs: ");
		System.out.println("Sailboat x = new Sailboat();");
		System.out.println("x.sailDownwind();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 2) {
			System.out.println("That was the right answer!  ====");
			counter++;
			Sailboat x = new Sailboat();
			x.sailDownwind();
			System.out.println();
			
		}
		else {
			System.out.println("WRONG");
			Sailboat x = new Sailboat();
			System.out.println("It should have printed out:");
			x.sailDownwind();
			System.out.println();
			
		}
		System.out.println("If this code runs: ");
		System.out.println("Sailboat x = new Sailboat();");
		System.out.println("x.capsize();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 5) {
			System.out.println("That was the right answer!  ====");
			counter++;
			System.out.println("It will print out an error.");
			System.out.println();
		}
		else {
			System.out.println("WRONG");
			
			System.out.println("It should have printed out:");
			System.out.println("ERROR");
			System.out.println();
		}
		System.out.println("If this code runs: ");
		System.out.println("snipe x = new Sailboat();");
		System.out.println("x.rigBoat();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 5) {
			System.out.println("That was the right answer!  ====");
			counter++;
			System.out.println();
			
		}
		else {
			System.out.println("WRONG");
			System.out.println("It should have printed out:");
			System.out.println("ERROR");
			System.out.println();
		}
		System.out.println("If this code runs: ");
		System.out.println("Sailboat x = new snipe();");
		System.out.println("x.rigBoat();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 1) {
			System.out.println("That was the right answer!  ====");
			counter++;
			Sailboat x = new snipe();
			x.rigBoat();
			System.out.println();
		}
		else {
			System.out.println("WRONG");
			Sailboat x = new snipe();
			System.out.println("It should have printed out:");
			x.rigBoat();
			System.out.println();
		}
		System.out.println("If this code runs: ");
		System.out.println("Sailboat x = new snipe();");
		System.out.println("x.sailDownwind();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 4) {
			System.out.println("That was the right answer!  ====");
			counter++;
			Sailboat x = new snipe();
			x.sailDownwind();
			System.out.println();
		}
		else {
			System.out.println("WRONG");
			Sailboat x = new snipe();
			System.out.println("It should have printed out:");
			x.sailDownwind();
			System.out.println();
		}
		System.out.println("If this code runs: ");
		System.out.println("snipe x = new Sailboat();");
		System.out.println("x.sailDownwind();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 5) {
			System.out.println("That was the right answer!  ====");
			counter++;
			System.out.println();
			
		}
		else {
			System.out.println("WRONG");
			System.out.println("It should have printed out:");
			System.out.println("ERROR");
			System.out.println();
		}
		System.out.println("If this code runs: ");
		System.out.println("Sailboat x = new snipe();");
		System.out.println("x.capsize();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 5) {
			System.out.println("That was the right answer!  ====");
			counter++;
			System.out.println("It will print out an error.");
			System.out.println();
			
		}
		else {
			System.out.println("WRONG");
			System.out.println("It should have printed out:");
			System.out.println("ERROR");
			System.out.println();
			
		}
		System.out.println("If this code runs: ");
		System.out.println("snipe x = new snipe();");
		System.out.println("x.rigBoat();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 1) {
			System.out.println("That was the right answer!  ====");
			counter++;
			snipe x = new snipe();
			x.rigBoat();
			System.out.println();
		}
		else {
			System.out.println("WRONG");
			snipe x = new snipe();
			System.out.println("It should have printed out:");
			x.rigBoat();
			System.out.println();
		}
		System.out.println("If this code runs: ");
		System.out.println("snipe x = new snipe();");
		System.out.println("x.sailDownwind();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 4) {
			System.out.println("That was the right answer!  ====");
			counter++;
			snipe x = new snipe();
			x.sailDownwind();
			System.out.println();
		}
		else {
			System.out.println("WRONG");
			snipe x = new snipe();
			System.out.println("It should have printed out:");
			x.sailDownwind();
			System.out.println();
		}
		System.out.println("If this code runs: ");
		System.out.println("snipe x = new snipe();");
		System.out.println("x.capsize();");
		System.out.println("What will be printed out?");
		System.out.println();
		
		System.out.println("(1) Set up the boat!");
		System.out.println("(2) Point the boat downwind!");
		System.out.println("(3) Flip the boat over and get in the water.");
		System.out.println("(4) Point the boat downwind and put the pole out to let the jib sail out!");
		System.out.println("(5) error");
		
		userChoice = UserIntInput.nextInt();
		
		if(userChoice == 3) {
			System.out.println("That was the right answer!  ====");
			counter++;
			snipe x = new snipe();
			x.capsize();
			System.out.println();
		}
		else {
			System.out.println("WRONG");
			snipe x = new snipe();
			System.out.println("It should have printed out:");
			x.capsize();
			System.out.println();
		}
		
		
		
		
		DecimalFormat d = new DecimalFormat("0.0");
		double t1 = 12;
		double t2 = counter;
		double total = t2/t1;
		total = total*100;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("You're final score was ");
		System.out.printf("%.2f", total);
		System.out.print("%");
		
		

	}

}
