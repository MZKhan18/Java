package Programms;
//Write a C program to print all unique elements in the array.
import java.util.Scanner;
public class array1d_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter values of array :");
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
				}
		int freq=0;
		System.out.println("Unique elements of array :");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(array[i]==array[j]) {
					freq++;
				}	
			}
			if(freq==1) {
				System.out.println(array[i]);
			}
		
		freq=0;
		}
		
sc.close();
	}

}
