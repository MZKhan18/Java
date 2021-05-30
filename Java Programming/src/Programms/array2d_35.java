package Programms;
//Write a C program to find sum of lower triangular matrix.
import java.util.Scanner;
public class array2d_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rows of Matrix :");
		int r=sc.nextInt();
		int matrix1[][]=new int[r][r];
		//taking matrix values
		for(int i=0;i<r;i++) {
			for(int j=0; j<r; j++) {
				System.out.print("Enter value of Matrix["+i+"]["+j+"] :");
				matrix1[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				if(i+j>=r-1) {
				sum += matrix1[i][j];	
				}
				
			}	
		}
		System.out.println("The sum of lower triangular matrix = "+sum);
		sc.close();
	}

}
