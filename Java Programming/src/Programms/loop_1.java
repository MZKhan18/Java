package Programms;
//. Write a program to calculate overtime pay of 10 employees. Overtime is paid at the rate 
//of Rs. 12.00 per hour for every hour worked above 40 hours. Assume that employees do 
//not work for fractional part of an hour.
import java.util.Scanner;
public class loop_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter hours worked");
		int hr= sc.nextInt();
		int op=0;
		for(int i=40; i<hr ;i++) {
			op =op+12;
		}
		System.out.println("Overtime pay of 10 employees = "+op*10);
		
		sc.close();
	}

}
