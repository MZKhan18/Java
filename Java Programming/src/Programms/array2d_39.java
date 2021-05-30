package Programms;
//. Write a C program to check Sparse matrix. 
import java.util.Scanner;
public class array2d_39 {

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
		
		//for printing matrix
		for(int i=0;i<r;i++) {
			for(int j=0; j<r; j++) {
				System.out.print(matrix1[i][j]+"  ");
				if(j==r-1) {
					System.out.println();
				}
			}
		}
		//counting no. of zeros present in matrix 
		int zCount=0;
		double limit= r*r/2;
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
			if(matrix1[i][j]==0) {
						zCount +=1;
				}
			}
		}
		if(zCount>limit) {
			System.out.println("IT IS A SPARSE MATRIX");
		}else {
			System.out.println("IT IS NOT A SPARSE MATRIX");
		}
		sc.close();
	}

}
