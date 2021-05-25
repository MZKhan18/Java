package Programms;
//Write a C program to find HCF (GCD) of two numbers. 
import java.util.Scanner;

public class loop_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hcf=0;
		for(int i =1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
				hcf = i;
			}
			
		}
		System.out.println("HCF = "+hcf);
	
		sc.close();
	
	}

}
