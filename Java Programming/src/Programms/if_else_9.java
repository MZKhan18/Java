package Programms;

import java.util.Scanner;

public class if_else_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any five digit number :");
		int n = sc.nextInt();
		if (n >= 10000 && n <= 99999) {
			int n1 = n;
			int a = n % 10;
			n /= 10;
			int b = n % 10;
			n /= 10;
			int c = n % 10;
			n /= 10;
			int d = n % 10;
			n /= 10;
			int e = n % 10;
			int rev = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
			if (rev == n1) {
				System.out.println("The orignal number and reversed number are equal.");
			} else {
				System.out.println("The orignal number and reversed number are not equal.");
			}
		} else {
			System.out.println("ERROR: Enter only five digit numbers");
		}

	}
}