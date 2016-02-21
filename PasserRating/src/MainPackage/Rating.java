package MainPackage;
import java.util.Scanner;
import java.lang.Math.*;
public class Rating {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		double touchdowns;
		double totalYards;
		double interceptions;
		double completions; 
		double numPassesAttempted;
		double a;
		double b;
		double c;
		double d;
		double PasserRating;
		System.out.println("How many touchdowns did the player have?");
		touchdowns=input.nextDouble();
		//System.out.println(touchdowns);//
		System.out.println("What is the total yards?");
		totalYards=input.nextDouble();
		System.out.println("How many intereceptions?");
		interceptions=input.nextDouble();
		System.out.println("How many completed passes?");
		completions=input.nextDouble();
		System.out.println("How many passes were attempted?");
		numPassesAttempted=input.nextDouble();
		
		a = ((completions / numPassesAttempted -.3) * 5);
		//System.out.println(a);//
		b = ((totalYards / numPassesAttempted -3) * .25);
		c = (touchdowns / numPassesAttempted * 20);
		d = 2.375-(interceptions / numPassesAttempted * 25);
		
		PasserRating = (((a+b+c+d)/6)*100);
		
		
		System.out.printf("The Passer rating is: %.2f \n",PasserRating);
				
		
		
		
		// TODO Auto-generated method stub

	}

}
