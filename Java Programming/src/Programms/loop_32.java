package Programms;
//Write a C program to find LCM of two numbers.
import java.util.Scanner;

public class loop_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int lcm=1;
		int count =1;
		int i=1;
		while(count!=0) {
			if(i%a==0 && i%b==0) {
				lcm = i;
				count =0;
			}else {
				i++;
			}
		}
		
		System.out.println("LCM = "+lcm);
	
		sc.close();
	}

}
