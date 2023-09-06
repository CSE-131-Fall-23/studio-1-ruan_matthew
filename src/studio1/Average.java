package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print ("The first number you wanna to be averaged is");
		int n1 = in.nextInt();
		System.out.print ("The second number you wanna to be averaged is");
		int n2 = in.nextInt();
		double ave=(n1+ n2)/2.0;
		System.out.print("The average of two numbers is "+(ave));

		
		
		

	}

}
