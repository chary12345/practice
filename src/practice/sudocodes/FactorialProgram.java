//Factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:


package practice.sudocodes;

import java.util.Scanner;

public class FactorialProgram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter number :");
		int number=scanner.nextInt();
		
		int facttorial=1;
		for(int i=1;i<=number;i++){
			facttorial=facttorial*i;
		}
		System.out.println(number+" factorial is : "+facttorial);
		 
			/*  int i,fact=1;
			  int number=6;//It is the number to calculate factorial    
			  for(i=1;i<=number;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact); */  
		
	}
}
