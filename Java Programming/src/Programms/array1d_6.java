package Programms;
//. Write a C program to count total number of even and odd elements in an array
import java.util.Scanner;
public class array1d_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		int eCount=0,oCount=0;
		System.out.println("Enter values of array :");
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
				}
		for(int i=0; i<n; i++)
		{
            if(array[i]%2==0) {
            	eCount++;
            }else {
            	oCount++;
            }
				}
		
 System.out.println("Number of Even elements = "+eCount);
 System.out.println("Number of Odd elements = "+oCount);
	sc.close();
	}

}
