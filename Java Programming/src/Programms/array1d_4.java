package Programms;
//. Write a C program to find maximum and minimum element in an array. 

import java.util.Scanner;
public class array1d_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		int max=0,min=(int) (Math.pow(2, 31)-1);
		System.out.println("Enter values of array :");
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
				}
		for(int i=0; i<n; i++)
		{
            if(array[i]>max) {
            	max=array[i];
            }
				}
		for(int i=0; i<n; i++)
		{
            if(array[i]<min) {
            	min=array[i];
            }
				}
 System.out.println("Maximum element = "+max);
 System.out.println("Minimum element = "+min);
	sc.close();
	}

}
