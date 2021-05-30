package Programms;
//. Write a C program to check whether two matrices are equal or not. 
import java.util.Scanner;
public class array2d_27 {

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
		
		int matrix2[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				System.out.print("Enter value of 2nd Matrix["+i+"]["+j+"] :");
				matrix2[i][j]=sc.nextInt();
			}
		}
		int count = 0;
		for(int i=0; i<r;i++) {
			for(int j=0; j<c; j++) {
				if(matrix1[i][j]==matrix2[i][j]) {
					count +=1;
				}
			}
		}
		if(count==r*c) {
			System.out.println("MATRIX ARE EQUAL");
		}else {
			System.out.println("MATRIX ARE NOT EQUAL");
		}
		sc.close();
	}

}
