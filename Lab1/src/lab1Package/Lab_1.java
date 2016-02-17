package lab1Package;

import java.util.Scanner;
import java.lang.Math;
public class Lab_1 {

	public static void main(String[] args) {
		
		// Allows for user input
		Scanner input = new Scanner(System.in);
		
		// Prompts user for all values needed and assigns them a variable name
		System.out.println("How many years do you plan to work?");
		int YearsWorked = input.nextInt();
		System.out.println("What is your expected annual return on your investment (Percentage)?");
		int AnnualReturn = input.nextInt();
		System.out.println("How long do you want to draw from your retirement?");
		int YearsDrawn = input.nextInt();
		System.out.println("What is your annual return on your retirement (Percentage)?");
		int AnnualRetirement = input.nextInt();
		System.out.println("What is your required retirement income?");
		int RetirementIncome = input.nextInt();
		System.out.println("What is your expected SSI income?");
		int SSI = input.nextInt();
		
		//declares variable, calculates total amount needed to save for retirement
		double TotalSaving;
		TotalSaving = (RetirementIncome-SSI)*((1-(1/(Math.pow(1+(AnnualRetirement*.01)/12,YearsDrawn*12)))))/((AnnualRetirement*.01)/12);

		
		//declares variable, calculates amount needed to save each month while working X amount of years
		double SaveMonthly;
		SaveMonthly = TotalSaving*(((AnnualReturn*.01)/12)/((Math.pow(1+(AnnualReturn*.01)/12,YearsWorked*12))-1));
		SaveMonthly = (double) (Math.round(SaveMonthly*100.0)/100.0);
		
		//prints amount needed to save per years worked
		System.out.print("You must save $" + SaveMonthly + " per month for " + YearsWorked + " years in order to retire comfortably.");
	}

}
