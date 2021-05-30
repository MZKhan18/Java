package Programms;
//Write a C program to find transpose of a matrix. 
import java.util.Scanner;
public class array2d_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rows  of Matrix :");
		int r=sc.nextInt();
		System.out.print("Enter coloumns of Matrix :");
		int c=sc.nextInt();
		int matrix1[][]=new int[r][c];
		//taking values of matrix 
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				System.out.print("Enter value of first Matrix["+i+"]["+j+"] :");
				matrix1[i][j]=sc.nextInt();
			}
		}
		//for printing matrix
		System.out.println("Matrix :");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(matrix1[i][j]+"  ");
				if(j==c-1) {
					System.out.println();
				}
	    	}
    	}
		//for transposing
		int matrix2[][]=new int[c][r];
		for(int i=0; i<r;i++) {
			for(int j=0; j<c; j++) {
				matrix2[j][i]=matrix1[i][j];
			}
			
		}
		//for printing transpose
		System.out.println();
		System.out.println("Transpose of matrix :");
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				System.out.print(matrix2[i][j]+"  ");
				if(j==r-1) {
					System.out.println();
				}
	    	}
    	}
		sc.close();
   }
}