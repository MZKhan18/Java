package Programms;

import java.util.Scanner;

public class basics_m {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of angle: ");
		double angle = sc.nextDouble();
		double angle1 = angle;
		angle = angle * 3.14D / 180.0D;
		double sinAngle = Math.sin(angle);
		double cosAngle = Math.cos(angle);
		double tanAngle = Math.tan(angle);
		System.out.println("Sin(" + angle1 + ") = " + sinAngle);
		System.out.println("Cos(" + angle1 + ") = " + cosAngle);
		System.out.println("Tan(" + angle1 + ") = " + tanAngle);
	}
}