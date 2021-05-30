package Programms;
//. Write a C program to check Symmetric matrix.
import java.util.Scanner;
public class array2d_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rows  of Matrix :");
		int r=sc.nextInt();
		int matrix1[][]=new int[r][r];
		//taking values of matrix 
		for(int i=0;i<r;i++) {
			for(int j=0; j<r; j++) {
				System.out.print("Enter value of first Matrix["+i+"]["+j+"] :");
				matrix1[i][j]=sc.nextInt();
			}
		}
		//for printing matrix
		System.out.println("Matrix :");
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				System.out.print(matrix1[i][j]+"  ");
				if(j==r-1) {
					System.out.println();
				}
	    	}
    	}
		//for transposing
		int matrix2[][]=new int[r][r];
		for(int i=0; i<r;i++) {
			for(int j=0; j<r; j++) {
				matrix2[j][i]=matrix1[i][j];
			}	
		}
		
		//checking if the matrix is symmetric or not
		int count =0;
		for(int i=0; i<r;i++) {
			for(int j=0; j<r; j++) {
				if(matrix1[i][j]==matrix2[i][j]) {
					continue;
			}else {
				count +=1;
			   }
			}
		}
		
		if(count==0) {
			System.out.println("IT IS A SYMMETRIC MATRIX ");
		}else {
			System.out.println("IT IS NOT A SYMMETRIC MATRIX");
		}
		sc.close();
	}

}
