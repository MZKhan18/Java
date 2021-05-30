package Programms;
//. Write a C program to delete all duplicate elements from an array. 
import java.util.Scanner;
public class array1d_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter values of array :");
		int count=0,freq=0;
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
				}
		
		System.out.println("Updated array without duplicate values :"); 
		//FOR FINDING AND DELETING DUPLICATE
		//for finding duplicate or frequency
		for(int i=0; i<array.length-count; i++) {
			for(int j=0; j<array.length-count; j++) {
				if(array[i]==array[j]) {
					freq++;
				}	
			}
			//if freq>1 the element will deleted, array size will reduce by count
			if(freq>1) {
				count++;
			  for(int k=i;k<array.length-count;k++) {
				  
				  array[k]=array[k+1];
			  }	
			}		
		freq=0;
		}
		//for printing the updated array
		for(int i=0; i<array.length-count; i++) {
			System.out.println(array[i]);
		}
		
sc.close();
	}


}
