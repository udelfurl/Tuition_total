package main;
import java.util.Scanner;
public class TotalTuition {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double tuition = 12342; //Year 1 of tuition 
		int year = 1;
		double rate;
		double total = tuition;
		for (year=1; year<5; year++) {
			System.out.println("what is the percentage increase of the tuition for the year: ");
			rate = input.nextDouble();
	    	total+= tuition*rate;
		}
System.out.println("the total tuition is" + total);
			
			
			
		
	}

}
