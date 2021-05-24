package Programms;

import java.util.Scanner;

public class if_else_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of the driver :");
		int age = sc.nextInt();
		System.out.print("Enter marital status of the driver (married or unmarried) :");
		String ms = sc.next();
		System.out.print("Enter sex of the driver (male or female) :");
		String sex = sc.next();
		if (ms.equalsIgnoreCase("married")) {
			System.out.println("The driver is insured.");
		} else if (ms.equalsIgnoreCase("unmarried") && sex.equalsIgnoreCase("male") && age > 30) {
			System.out.println("The driver is insured.");
		} else if (ms.equalsIgnoreCase("unmarried") && sex.equalsIgnoreCase("female") && age > 25) {
			System.out.println("The driver is insured.");
		} else {
			System.out.println("The driver is not insured.");
		}
sc.close();
	}
}
