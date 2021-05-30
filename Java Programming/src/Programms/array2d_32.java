package Programms;
//Write a C program to find upper triangular matrix. 
import java.util.Scanner;
public class array2d_32 {

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
		System.out.println("Upper triangular matrix :");
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				if(i+j<=r-1) {
					System.out.print(matrix1[i][j]+"  ");
				}
				if(j==r-1) {
					System.out.println();
				}
			}	
		}
		sc.close();
	}

}
