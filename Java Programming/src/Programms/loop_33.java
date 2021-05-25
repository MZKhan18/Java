package Programms;
//Write a C program to check whether a number is Prime number or not.
import java.util.Scanner;
public class loop_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number :");
		int n = sc.nextInt();
		boolean check =false ;
	    for(int i=2; i<n; i++) {
	    	if(n%i==0) {
	    		check = true;
	    	}
	    	
	    }
	    if(check) {
	    	System.out.println("It is not a prime");
	    }
	    else {
	    	System.out.println("It is a prime");
	    }
		
	    sc.close();
	}

}
