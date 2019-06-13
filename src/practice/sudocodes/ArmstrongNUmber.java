//find given no is armstrong or not

/*Armstrong Number in Java: A positive number is called armstrong number if it is equal 
to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.*/

package practice.sudocodes;

import java.util.Scanner;

public class ArmstrongNUmber {

	public static void main(String[] args) {

		int x; 
		int y;
		int temp;
		int result = 0;
		System.out.println("Ënter a Number");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		scanner.close();
		

		for (y = x; y != 0; y /= 10) {
			temp = y % 10;
			result = result + temp * temp * temp;
		}

		if (result == x)
			System.out.println(x + " is an Armstrong number");
		else
			System.out.println(x + " is not an Armstrong number");
	}

}
