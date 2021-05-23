package Programms;

import java.util.Scanner;

public class if_eles_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character :");
		char ch = sc.next().charAt(0);
		if ((ch < 'A' || ch > '[') && (ch < 'a' || ch > '{')) {
			System.out.println("It is not an alphabet");
		} else {
			System.out.println("It is an alphabet");
		}

	}
}