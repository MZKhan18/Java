package Programms;

import java.util.Scanner;

public class if_else_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hra = 0.0D;
		double da = 0.0D;
		System.out.print("Enter Employees's salary :");
		double bsal = sc.nextDouble();
		if (bsal < 1500.0D) {
			hra = bsal * 0.1D;
			da = bsal * 0.9D;
		} else if (bsal >= 1500.0D) {
			hra = 500.0D;
			da = bsal * 0.98D;
		}

		double gsal = bsal + da + hra;
		System.out.println("Gross Salary = " + gsal);
		sc.close();
	}
}
