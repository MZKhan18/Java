package Programms;
//. Write a C program to print all Prime numbers between 1 to n and also print their sum
import java.util.Scanner;
public class loop_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any end limit ");
		int n = sc.nextInt();
		System.out.println("List of Prime numbers:");
		int count ,sum=0;
		for(int i =1 ; i <=n ;i++) {
			count =0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					break;
				}else {
					count++;
				}
			}
		if(count+2==i) {
			System.out.println(i);
			sum = sum+i;
		}else {
			continue;
		}
}
	System.out.println("SUM of Primes = "+sum);	
		
	sc.close();
	}

}
