package Programms;
//. Write a C program to copy all elements from an array to another array. 
import java.util.Scanner;
public class array1d_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		int array2[]=new int[n];
		System.out.println("Enter values of array :");
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
				}
		for(int i=0; i<n; i++)
		{
            array2[i]=array[i];
				}
		System.out.println("New array :");
		for(int i=0; i<n; i++)
		{
            System.out.println(array2[i]);
				}
sc.close();
	}

}
