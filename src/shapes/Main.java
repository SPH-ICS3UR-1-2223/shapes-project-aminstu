package shapes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice;
		Triangle Tria;
		Circle Circ;
		Rectangle Rect;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Do you want to:");
			System.out.println("1. Create a Triangle");
			System.out.println("2. Create a Circle");
			System.out.println("3. Create a Rectangle");
			System.out.println("4. Quit");
			try {
				userChoice = in.nextInt();
			} catch (InputMismatchException e) {
				userChoice = 4;
				in.nextLine();

			}
		
				

			if (userChoice == 1) {
				System.out.println("CREATING TRIANGLE");
				System.out.println("Enter values for sides A, B and C correspondingly");
				Tria = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
				Tria.printStats();
			} else if (userChoice == 2) {
				System.out.println("You selected CIRCLE");
				System.out.println("Enter a value for the radius");
				Circ = new Circle(in.nextDouble());
				Circ.printStats();
			} else if (userChoice == 3) {
				System.out.println("CREATING RECTANGLE");
				System.out.println("Enter values for the length and width correspondingly");
				Rect = new Rectangle(in.nextDouble(), in.nextDouble());
				Rect.printStats();

			} else if (userChoice == 4) {
				System.out.println("Program Exited, Rerun To Start Over");
				System.exit(0);

			}

		} while (userChoice != 4);
		System.out.println("You have exited the program");

	}
}
