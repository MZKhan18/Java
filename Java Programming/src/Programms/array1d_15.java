package Programms;
//Write a C program to merge two array to third array.
import java.util.Scanner;
public class array1d_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of first array :");
		int n=sc.nextInt();
		int array1[]=new int[n];
		System.out.println("Enter values of first array :");
		for(int i=0; i<n; i++)
		{
			array1[i]=sc.nextInt();
				}
		System.out.print("Enter size of second array :");
		int m=sc.nextInt();
		int array2[]=new int[m];
		System.out.println("Enter values of second array :");
		for(int i=0; i<m; i++)
		{
			array2[i]=sc.nextInt();
				}
		int array3[]=new int[m+n];
		for(int i=0; i<n; i++) {
			array3[i]=array1[i];
		}
		for(int i=0; i<m; i++) {
			array3[i+n]=array2[i];
		}
		System.out.println("Merged array :");
		for(int i=0; i<n+m; i++) {
			System.out.print(array3[i]+"   ");
		}
		sc.close();		
	}

}
