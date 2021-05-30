package Programms;
//. Write a C program to count frequency of each element in an array.
import java.util.Scanner;
public class array1d_11 {

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
		System.out.println("Element  -  Frequency");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(array[i]==array[j]) {
					freq++;
				}	
			}
		System.out.println(array[i]+"             "+freq);
		freq=0;
		}
		
sc.close();
	}

}
