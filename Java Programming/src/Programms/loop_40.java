package Programms;
//. Write a C program to print all Perfect numbers between 1 to n. 
import java.util.Scanner;
public class loop_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any end limit :");
		int n= sc.nextInt();
		int sum=0;
		System.out.println("List of perfect numbers: ");
		for(int i =1; i<n ; i++) {
			for(int j=1; j<i ;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
		    if(sum==i) {
		    	System.out.println(i);
		    }
		    sum=0;
		}
		sc.close();
		
	}

}
