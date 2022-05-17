package QUESTIONS;



	import java.util.Scanner;

	public class Question2 {

		public static void main(String[] args) {

			double kilometers;

			System.out.println("Please enter kilometers:");

			Scanner in = new Scanner(System.in);
			kilometers = in.nextDouble();

			double miles = kilometers / 1.6;

			System.out.println(miles + " Miles");

		}
	}
	
	

