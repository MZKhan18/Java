package Programms;
//. Write a C program to delete an element from an array at specified position. 
import java.util.Scanner;
public class array1d_10 {

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
		System.out.print("Enter position of element to be deleted :");
		int index = sc.nextInt();
		for(int i=index-1; i<n-1; i++) {
			array[i]=array[i+1];
		}
		System.out.println("Updated array :");
		for(int i=0; i<n-1; i++) {
			System.out.println(array[i]);
		}
sc.close();
	}

}
