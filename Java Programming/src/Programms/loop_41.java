package Programms;
//. Write a C program to check whether a number is Strong number or not. 
import java.util.Scanner;
public class loop_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any Number :");
		int n = sc.nextInt();
		int a,n1,sum=0;
		n1=n;
		  
			while(n1!=0) {
		    	  a=n1%10;
		    	  sum = sum + fact(a);
		    	  n1=n1/10;
		      }
		
		     
		if(sum==n) {
			System.out.println("It is a strong number");
		}else {
			System.out.println("It is not a perfect number");
					}
		
		sc.close();
		}
		
		
static int fact(int x) {
	int facto=1;
	for(int i=1; i<=x; i++) {
		facto = facto*i;
	}
	return facto;
}
	
	
	}


