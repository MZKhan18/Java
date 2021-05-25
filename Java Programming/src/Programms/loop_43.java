package Programms;
//. Write a C program to print Fibonacci series up to n terms
import java.util.Scanner;
public class loop_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any any end limit :");
		int n= sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.println("Fibonacci Series:");
		System.out.println(n2);
		for(int i=2; i<=n;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		sc.close();
	}

}
