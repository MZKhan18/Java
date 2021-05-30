package Programms;
//. Write a C program to find maximum and minimum element in an array. 
import java.util.Scanner;

public class array1d_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		int max=0,index=0,secondLarge=0;
		System.out.println("Enter values of array :");
		//taking values of array
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
				}
		//finding largest value
		for(int i=0; i<n; i++)
		{
            if(array[i]>max) {
            	max=array[i];
            }
				}
		//finding index
		for(int i=0; i<n; i++)
		{
           if(array[i]==max) {
        	   index=i;
           }
				}
		//deleting largest value
		for(int i=index; i<n-1;i++) {
			array[i]=array[i+1];
		}
		//for finding largest of updated array(after deleting largest value we will get 2nd largest value)
		for(int i=0; i<n-1; i++)
		{
			if(array[i]>secondLarge) {
				secondLarge=array[i];
			}
		}
		
 System.out.println("Second largest element = "+secondLarge);

	sc.close();
	}

}
