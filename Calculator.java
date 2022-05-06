package ch01ATAProject;
import java.util.Scanner;

public class calculator {
	
	// the sum,sub,mult and div of x and y integer

	public static void main (String [] args) {
		int x,y,sum,subst,mult,div;
		Scanner newobj = new Scanner (System.in);
		System.out.println("Enter the first number: ");
		x = newobj.nextInt();
		System.out.println("Enter the second number: ");
		y = newobj.nextInt();
		sum = x+y;
		subst = x-y;
		mult = x * y;
		div = x/y;
