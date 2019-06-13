//swapping 2 numbers

package practice.sudocodes;

public class Swapping {

	public static void main(String[] args) {
		
		int x=25;
		int y=26;
		System.out.println("before swapping x value is "+x);
		System.out.println("before swapping y value is "+y);
		System.out.println("--------------------------------------");
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("--------------------------------------");

		System.out.println("after swapping x value is "+x);
		System.out.println("after swapping y value is "+y);

	}
}
/*//swapping theory : assume two numbers x&y. add two nubers.do result substract second number,
//keep aside the value(1).these value substracted from addition of two numbers.
//see the out puts=swapped.value is 2,result is 1.*/