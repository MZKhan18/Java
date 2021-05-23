package Programms;
//. Write a C program to input electricity unit charges and calculate total electricity bill according to 
//the given condition: 
//For first 50 units Rs. 0.50/unit 
//For next 100 units Rs. 0.75/unit 
//For next 100 units Rs. 1.20/unit 
//For unit above 250 Rs. 1.50/unit 
//An additional surcharge of 20% is added to the bill
import java.util.Scanner;
public class if_else_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter electricity unit charges :");
       double bill=0,tbill,surcharge;
       int unit = sc.nextInt();
       if(unit<=50) {
 
    	   bill = unit*0.5;
       }
       else if(unit>50 && unit<=150) {
 
    	   bill = 25 + (unit-50)*0.75;
       }
       else if(unit>150 && unit<=250) {

    	   bill = 100 + (unit-150)*1.2;
       }
       else if(unit>250) {

    	   bill = 220 + (unit-250)*1.5;
       }
       surcharge = bill*0.2;
       tbill= bill + surcharge;
       System.out.println("Total Electricity bill = "+tbill);
	}

}
