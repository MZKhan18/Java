package Programms;
//. Write a C program to interchange diagonals of a matrix.
import java.util.Scanner;
public class array2d_31 {

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
		System.out.println("Matrix before swap:");
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				System.out.print(matrix1[i][j]+"  ");
				if(j==r-1) {
					System.out.println();
				}
			}
		}
		int temp;
		for(int i=0; i<r; i++) {
			for(int j=0; j<r;j++) {
				if(j==0 && (i==0 || i==r-1)) {
					temp=matrix1[i][r-1];
					matrix1[i][r-1]=matrix1[i][j];
					matrix1[i][j]=temp;
				}
			}
		}
		System.out.println("Matrix after swap:");
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				System.out.print(matrix1[i][j]+"  ");
				if(j==r-1) {
					System.out.println();
				}
			}
		}
		sc.close();
	}

}
