package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		// Input
		String text = "We learn java basics as part of java sessions in java week1";
		
		
		String[] tsplit = text.split(" ");

		LinkedHashSet<String> list = new LinkedHashSet<String>();

		for (String result : tsplit) {
			list.add(result);
		}
		
		System.out.println("Given String: "+Arrays.toString(tsplit));
		
		System.out.println("String without duplicates: ");
		for(String i:list) {
			System.out.println(i+" ");
		}
		//System.out.println(list);
	}

}
