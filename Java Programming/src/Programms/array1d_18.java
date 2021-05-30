package Programms;
//. Write a C program to search an element in an array.
import java.util.Scanner;
public class array1d_18 {

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
		System.out.print("Enter the element to search :");
		int search = sc.nextInt();
		for(int i=0; i<n; i++) {
			if(array[i]==search) {
				System.out.println(search+" found at index "+i);
				break;
			}
		}
	sc.close();
	}

}
