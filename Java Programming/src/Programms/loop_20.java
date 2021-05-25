package Programms;
//Write a C program to find first and last digit of a number
import java.util.Scanner;
public class loop_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any nymber :");
		int n= sc.nextInt();
		int n1=n,ld=0,fd=0;
		while(n!=0) {
			 int a=n%10;
			 if(n==n1) {
				  ld =a;
			 }else if(n*10<100) {
				 fd=a;
			 }
			 n=n/10;
		}
		System.out.println("First Digit = "+fd);
		System.out.println("Last Digit = "+ld);
		sc.close();
		
		
	}

}
