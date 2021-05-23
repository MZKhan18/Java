package Programms;

import java.util.Scanner;

public class basics_q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of money: ");
		int n = sc.nextInt();
		int N = n;
		int n100 = n / 100;
		n %= 100;
		int n50 = n / 50;
		n %= 50;
		int n10 = n / 10;
		n %= 10;
		int n5 = n / 5;
		n %= 5;
		int n2 = n / 2;
		n %= 2;
		int n1 = n / 1;
		int count = n1 + n2 + n5 + n10 + n50 + n100;
		System.out.println("Smallest numbers of notes that will combine to give Rs. " + N + " = " + count);
	}
}