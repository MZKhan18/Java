package Programms;
//Write a C program to check whether a number is Perfect number or not
import java.util.Scanner;
public class loop_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int n = sc.nextInt();
		int sum =0;
		for(int i =1; i<n; i++) {
			if(n%i==0) {
				sum = sum + i;
			}
			
		}
	if(n==sum) {
		System.out.println("It is a perfect number");
	}
	else {
		System.out.println("It is not a perfect number");
	}
	sc.close();
	}

}
