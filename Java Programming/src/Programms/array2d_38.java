package Programms;
//. Write a C program to check Identity matrix. 
import java.util.Scanner;
public class array2d_38 {

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
		for(int i=0;i<r;i++) {
			for(int j=0; j<r; j++) {
				System.out.print(matrix1[i][j]+"  ");
				if(j==r-1) {
					System.out.println();
				}
			}
		}
		
		//checking whether the matrix is identity matrix or not 
		int count=0,sum=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
				if(i==j) {
					if(matrix1[i][j]==1 || matrix1[i][j]==0) {
						count +=1;
					}
				}else if(i!=j) {
					if(matrix1[i][j]==0) {
						count +=1;
					}
				}
				sum += matrix1[i][j];
			}
		}
		
		if(count==r*r && sum>1) {
			System.out.println("IT IS AN IDENTITY MATRIX");
		}else {
			System.out.println("IT IS NOT AN IDENTITY MATRIX");
		}
		

		sc.close();
	}

}
