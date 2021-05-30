package Programms;
//. Write a C program to add two matrices. 
import java.util.Scanner;
public class array2d_23 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rows of Matrix :");
		int r=sc.nextInt();
		System.out.print("Enter coloumns of Matrix :");
		int c=sc.nextInt();
		int matrix1[][]=new int[r][c];
		//taking matrix values
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				System.out.print("Enter value of 1st Matrix["+i+"]["+j+"] :");
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		int matrix2[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				System.out.print("Enter value of 2nd Matrix["+i+"]["+j+"] :");
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		int matrix3[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
				}
			}
		System.out.println("Sum = ");
		//printing matrix values
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				System.out.print(matrix3[i][j]+"  ");
				if(j==c-1) {
					System.out.println("");
				}
			}
		}
		sc.close();
		
	}
}
