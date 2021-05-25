package Programms;
//. Write a program to print all the ASCII values and their equivalent characters using a 
//while loop. The ASCII values vary from 0 to 255.
public class loop_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Character   -   ASCII value");
		for(int i =0; i<=255; i++) {
			char c= (char)i;
			System.out.println(c+"           -        "+i);
		}
		
	}

}
