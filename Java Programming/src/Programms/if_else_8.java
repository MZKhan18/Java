package Programms;

import java.util.Scanner;

public class if_else_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Cost Price of item :");
		int cp = sc.nextInt();
		System.out.print("Enter Selling price of iten :");
		int sp = sc.nextInt();
		int loss;
		if (cp > sp) {
			loss = cp - sp;
			System.out.println("The seller has made loss of " + loss + " Rs.");
		} else {
			loss = sp - cp;
			System.out.println("The seller has made profit of " + loss + " Rs.");
		}

	}
}