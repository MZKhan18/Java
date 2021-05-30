package Programms;
//Write a C program to multiply two matrices. 
import java.util.Scanner;
public class array2d_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rows first of Matrix :");
		int r1=sc.nextInt();
		System.out.print("Enter coloumns first of Matrix :");
		int c1=sc.nextInt();
		int matrix1[][]=new int[r1][c1];
		//taking values of first matrix 
		for(int i=0;i<r1;i++) {
			for(int j=0; j<c1; j++) {
				System.out.print("Enter value of first Matrix["+i+"]["+j+"] :");
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter rows of second matrix :");
		int r2=sc.nextInt();
		System.out.print("Enter coloumns of second matrix :");
		int c2=sc.nextInt();
		int matrix2[][]=new int[r2][c2];
		//taking values of second matrix
		for(int i=0;i<r2;i++) {
			for(int j=0; j<c2; j++) {
				System.out.print("Enter value of second Matrix["+i+"]["+j+"] :");
				matrix2[i][j]=sc.nextInt();
			}	
		}	
		int matrix3[][] = new int[r1][c2];
		if(c1==r2) {
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				matrix3[i][j]=0;
				for(int k=0; k<c1; k++) {
					matrix3[i][j] +=matrix1[i][k]*matrix2[k][j];
				}
				System.out.print(matrix3[i][j]+"   ");
			}
			System.out.println();
		}
		}
		else {
			System.out.println("ERROR: number of coloumns of 1st matrix should equal to number of rows of 2nd matrix");
		}
		sc.close();	
			
		}
	}


