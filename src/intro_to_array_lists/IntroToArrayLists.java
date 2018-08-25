package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		String x;
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList <String> numbers = new ArrayList<String>();
		//2. Add five Strings to your list
		for (int i = 0; i < 5; i++) {
		numbers.add("e" + i);	
		}
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String number : numbers) {
			System.out.println(number);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < numbers.size(); i=i+2) {
			System.out.println(numbers.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = numbers.size()-1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < numbers.size(); i++) {
			x=numbers.get(i);
			for (int j = 0; j < x.length(); j++) {
				
			
			if(x.charAt(j)=='e') {
				System.out.println(numbers.get(i));
			}
			}
		}
	}
}
