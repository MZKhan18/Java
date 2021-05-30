package Programms;
//. Write a C program to sort array elements in ascending or descending order.
import java.util.Scanner;
public class array1d_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		int temp;
		System.out.println("Enter values of array :");
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
				}
		System.out.println("How do you want to sort the array: Ascending or Descending");
		String str1= sc.next();
		//for sorting array in ascending order
		if(str1.equalsIgnoreCase("ascending")) {
			for(int i=0;i<n; i++) {
				for(int j=i+1; j<n; j++) {
					if(array[i]>array[j]) {
						temp=array[j];
						array[j]=array[i];
						array[i]=temp;
					}
				}
				
			}
		}
		//for sorting array in descending order
		else if(str1.equalsIgnoreCase("descending")) {
			for(int i=0;i<n; i++) {
				for(int j=i+1; j<n; j++) {
					if(array[i]<array[j]) {
						temp=array[j];
						array[j]=array[i];
						array[i]=temp;
					}
				}
				
			}
		}
		else{
			System.out.println("ERROR:enter correct spelling");
		}
		
		
		//for printing the sorted array
		for(int i=0; i<n ;i++) {
			if(str1.equalsIgnoreCase("ascending")) {
		System.out.print(array[i]);
				if(i<n-1) {
					System.out.print(" < ");
				   }
		     	}
			else if(str1.equalsIgnoreCase("descending")){
				System.out.print(array[i]);
			     	if(i<n-1) {
					System.out.print(" > ");
				}
	     	}
			else {}
		}
	sc.close();
	}

}
