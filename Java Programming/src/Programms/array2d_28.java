package Programms;
//. Write a C program to find sum of main diagonal elements of a matrix. 
import java.util.Scanner;
public class array2d_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rows of Matrix :");
		int r=sc.nextInt();
		System.out.print("Enter coloumns of Matrix :");
		int c=sc.nextInt();
		int matrix1[][]=new int[r][c];
		//taking matrix values
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				System.out.print("Enter value of Matrix["+i+"]["+j+"] :");
				matrix1[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<r;i++) {
			for(int j=0; j<c; j++) {
				if(i==j) {
					sum=sum+matrix1[i][j];
				}
			}
		}
		System.out.println("Sum of main diagonal elements of matrix is = "+sum);
		sc.close();
	}
	

}
