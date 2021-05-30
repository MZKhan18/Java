package Programms;
//. Write a C program to put even and odd elements of array in two separate array. 
import java.util.Scanner;
public class array1d_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		int arrayEven[]=new int[n];
		int arrayOdd[]=new int[n];
		int e=0,o=0,eCount=0,oCount=0;
		System.out.println("Enter values of array :");
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
				}
		for(int i=0; i<n; i++) {
			if(array[i]%2==0) {
				arrayEven[e++]=array[i];
				eCount++;
			}else {
				arrayOdd[o++]=array[i];
				oCount++;
			}
		}
		System.out.println("Array with even elements");
	 for(int i=0;i<eCount;i++) {
		 System.out.print(arrayEven[i]+"  ");
	 }
	 System.out.println("");
	 System.out.println("Array with odd elements");
	 for(int i=0;i<oCount;i++) {
		 System.out.print(arrayOdd[i]+"  ");
	 }
		sc.close();
	}

}
