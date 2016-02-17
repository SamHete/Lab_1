package lab1Package;

import java.util.Scanner;

public class Lab_1 {

	public static void main(String[] args) {
		
		// Allows for user input
		Scanner input = new Scanner(System.in);
		// Prompts user for all values needed and assigns them a varName
		System.out.println("How many years do you plan to work?");
		int YearsWorked = input.nextInt();
		System.out.println("What is your expected average return on your investment (Percentage?");
		int AvgReturn = input.nextInt();
		System.out.println("How long do you want to draw from your retirement?");
		int YearsDrawn = input.nextInt();
		System.out.println("What is your required retirement income?");
		int RetirementIncome = input.nextInt();
		System.out.println("What is your expected SSI income?");
		int SSI = input.nextInt();
		
		double AvgReturn2 = (AvgReturn/100);
		
	}

}
