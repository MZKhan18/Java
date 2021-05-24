package Programms;

import java.util.Scanner;

public class basics_a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basic salary of Ramesh:");
		double bsal = sc.nextDouble();
		double da = bsal * 0.4D;
		double hr = bsal * 0.2D;
		double gsal = da + hr + bsal;
		System.out.println("Gross Salary of Ramesh is : " + gsal);
		sc.close();
	}
}
