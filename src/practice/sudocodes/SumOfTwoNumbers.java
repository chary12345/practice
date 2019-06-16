//To print sum of two digits of x+y;

package practice.sudocodes;

import java.util.Scanner;

public class SumOfTwoNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter value of x :");
		int x = scanner.nextInt();
		System.out.print("enter value of y :");
		int y =scanner.nextInt();
		
		int sum = x+y;
		System.out.println("sum of two values are "+sum);
		
	}
}
