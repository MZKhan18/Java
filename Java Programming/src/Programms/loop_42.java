package Programms;
//Write a C program to print all Strong numbers between 1 to n
import java.util.Scanner;
public class loop_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter any end limit :");
      int n= sc.nextInt();
      int n1,a ,sum=0,i;
      System.out.println("List of perfect numbers:");
      for(i=1;i<=n;i++) {
    	  n1=i;
    	  while(n1!=0) {
    		  a=n1%10;
    		  sum= sum+fact(a);
    		  n1=n1/10;
    	  }
    	if(sum==i) {
    		System.out.println(i);
    	}
    	sum=0;
      }
     
    sc.close();  
	}
	
static int fact(int x) {
	
		int facto=1;
		for(int i=1; i<=x; i++) {
			facto = facto*i;
		}
		return facto;
	}

}
