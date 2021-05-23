package Programms;

import java.util.Scanner;

public class basics_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[5];
		int sum = 0;
		System.out.println("Enter marks of five subjects:");

		for (int i = 0; i < marks.length; ++i) {
			marks[i] = sc.nextInt();
			sum += marks[i];
		}

		double percentage = (double) (sum / 5);
		System.out.println("Aggregate marks = " + sum);
		System.out.println("Percentage = " + percentage + "%");
	}
}