package Programms;

import java.util.Scanner;

public class basics_g {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any five-digit number: ");
		int n = sc.nextInt();
		if (n >= 10000 && n <= 99999) {
			int a = 0;
			a = a + n % 10;
			n /= 10;
			a += n % 10;
			n /= 10;
			a += n % 10;
			n /= 10;
			a += n % 10;
			n /= 10;
			a += n % 10;
			System.out.println(a);
		} else {
			System.out.println("Error:Enter five-digit numbers only");
		}
sc.close();
	}
}
