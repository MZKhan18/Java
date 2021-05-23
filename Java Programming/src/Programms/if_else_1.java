package Programms;

import java.util.Scanner;

public class if_else_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter quantity purchased :");
		int qty = sc.nextInt();
		System.out.print("Enter price per item :");
		int price = sc.nextInt();
		double totalCost;
		if (qty > 1000) {
			totalCost = (double) (price * qty) - (double) (price * qty) * 0.1D;
			System.out.println("Total Expenses = " + totalCost);
		} else {
			totalCost = (double) (price * qty);
			System.out.println("Total Expenses = " + totalCost);
		}

	}
}