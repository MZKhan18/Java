package Programms;

import java.util.Scanner;

public class basics_p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Firt number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second number: ");
		int b = sc.nextInt();
		System.out.println("Before Swapping a=" + a + " b=" + b);
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("After Swapping a=" + a + " b=" + b);
	}
}