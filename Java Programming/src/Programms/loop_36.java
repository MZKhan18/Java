package Programms;
//. Write a C program to find all prime factors of a number. 
import java.util.Scanner;
public class loop_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number :");
		int n = sc.nextInt();
		System.out.println("List of prime factors:");
		for(int i =2; i<=n; i++) {
               if(n%i==0 && check(i)==1) {
            	   System.out.println(i);
               }
               else {
            	   continue;
               }	
		}
		sc.close();
	}
	
//	Method to check if factor i.e. i(of loop) is prime or not
static int check(int n) {
	boolean check =false ;
    for(int i=2; i<n; i++) {
    	if(n%i==0) {
    		check = true;
    	}
    }
    if(check) {
    	return 0;
    }else {
    	return 1;
    }
}

}
