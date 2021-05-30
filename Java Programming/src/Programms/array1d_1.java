package Programms;
//. Write a C program to read and print elements of array.
import java.util.Scanner;
public class array1d_1 {

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
		System.out.println("Array :");
		for(int i=0; i<n; i++)
		{
			System.out.println(array[i]);
				}
		sc.close();
	}

}
