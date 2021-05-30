package Programms;
//Write a C program to find reverse of an array.
import java.util.Scanner;
public class array1d_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter size of array :");
			int n=sc.nextInt();
			int array[]=new int[n];
			int array1[] =new int[n];
			System.out.println("Enter values of array :");
			for(int i=0; i<n; i++)
			{
				array[i]=sc.nextInt();
					}
			for(int i=0; i<n;i++) {
				array1[i]=array[n-1-i];
			}
			System.out.println("Reversed Array :");
			for(int i=0; i<n;i++) {
				System.out.println(array1[i]);
			}
			sc.close();			
	}

}
