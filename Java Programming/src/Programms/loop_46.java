package Programms;
//. Write a program to generate all combinations of 1, 2 and 3 using for loop. 

public class loop_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=3;i++) {
			for(j=1;j<=3;j++) {
				for(k=1;k<=3;k++) {
					if(i!=j && j!=k && k!=i) {
					System.out.println(i+""+j+""+k);
					}
				}
			}
		}
		
	}

}
