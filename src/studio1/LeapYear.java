package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int Year = in.nextInt();;
		boolean LeapYear = (Year%4==0) && (Year%100!=0) && (Year%400==0);
		System.out.println("Is this a leap year?" + LeapYear);
		

	}

}
