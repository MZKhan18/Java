package Programms;
//Write a program to find the factorial value of any number entered through the keyboard. 
import java.util.Scanner;
public class loop_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int num = sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
			}
		System.out.println("Factorial : "+fact);
		sc.close();
		
	}

}
