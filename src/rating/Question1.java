package rating;

import java.util.Scanner;

public class Question1 {
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter total number of touchdowns: ");
		double TD = sc.nextDouble();
		
		System.out.print("Enter total number of yards: ");
		double Yards = sc.nextDouble();
		
		System.out.print("Enter total number of interceptions: ");
		double INT = sc.nextDouble();
		
		System.out.print("Enter total number of completions: ");
		double COMP = sc.nextDouble();
		
		System.out.print("Enter total number of attempted passes: ");
		double ATT = sc.nextDouble();
		
		
		double a = ((COMP/ATT )-.3) * 5; 
		double b = ((Yards/ATT)-3)* .25;
		double c = ((TD/ATT)* 20 );
		double d = (2.375 - ((INT/ATT)*25));
		
		double QB_Rating = ((a + b + c + d)/6)*100;
		
		
		System.out.printf(" The rating for this player is: %.1f ", QB_Rating);
				
	}
}