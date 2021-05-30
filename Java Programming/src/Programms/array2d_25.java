package Programms;
//. Write a C program to perform Scalar matrix multiplication.
import java.util.Scanner;
public class array2d_25 {

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
				System.out.print("Enter value of 1st Matrix["+i+"]["+j+"] :");
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter a scaler value to multiply the matrix by :");
		int n=sc.nextInt();
		//printing matrix values
				for(int i=0;i<r;i++) {
					for(int j=0; j<c; j++) {
						System.out.print(n*matrix1[i][j]+"  ");
						if(j==c-1) {
							System.out.println("");
						}
					}
				}
				sc.close();
	}

}
