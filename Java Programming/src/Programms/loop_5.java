package Programms;
//Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes 
//of each digit of the number is equal to the number itself, then the number is called an 
//Armstrong number. For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ) 
import java.util.Scanner;
public class loop_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		for(int i=1; i<=500 ;i++) {
			int sum=0;
			int n =i;
			while(n!=0) {
				  int a=n%10;
				  sum = sum + a*a*a;
				  n=n/10;
			}
		if(sum==i) {
			System.out.println(i);
		}
		sc.close();	
		}
		
//		to count how many digits a number has
//		int count =0;
//		int n1=345;
//		while(n1!=0) {
//			n1=n1/10;
//			count++;
//		}
//		System.out.println("Digits = "+count);
	
	}

}
