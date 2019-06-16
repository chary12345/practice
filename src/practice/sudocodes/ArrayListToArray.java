package practice.sudocodes;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ravi");
		list.add("ramu");
		list.add("raju");
		list.add("rasi");
		list.add("rakul");
		list.add("rakesh");
		
		
		System.out.println("converting array to array list");
		System.out.println(list);
		
		System.out.println("converying array list to array");
		for (String string : list) {
			System.out.println(string);
		}
	}
}
