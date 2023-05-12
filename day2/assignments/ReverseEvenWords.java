package week3.day2.assignments;

import java.util.Arrays;

//To Do
public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a Software Tester";
		String result = "";

		String[] words = input.split(" ");

		System.out.println("Given String: " + Arrays.toString(words));

		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) {
				// System.out.println(words[i]);
				for (int j = words[i].length() - 1; j >= 0; j--) {
					result = result + words[i].charAt(j) + " ";
				}
				// result = result + new StringBuilder(words[i]).reverse().toString()+ " ";
			} else {
				result = result + words[i] + " ";
			}

		}
		result = result.trim();
		System.out.println("Even Words Reversed String: " + result + " ");
	}
}
