package Programms;
//. Two numbers are entered through the keyboard. Write a program to find the value of one 
//number raised to the power of another.
import java.util.Scanner;

public class loop_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter base number :");
       int b= sc.nextInt();
       System.out.print("Enter power number :");
       int p = sc.nextInt();
       int num=1;
       for(int i =0; i<p; i++)
       {
    	   num=num*b;
    	   
       }
       System.out.println(b+"^"+p+" = "+num);
       
       
       sc.close(); 
	}

}
