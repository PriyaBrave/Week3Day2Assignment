package week3.day2.assignments;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// Input
		String s1 = "stops", s2 = "potss";
		int l1,l2;
		boolean check = true;
		
		l1 = s1.length();
		l2 = s2.length();
		
		if(l1 != l2) {
			check = false;
		} else {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			check = Arrays.equals(ch1, ch2);
		}
		if(check) {
			System.out.println("Strings "+s1+" and "+s2+" are equal..");
		} else {
			System.out.println("Strings "+s1+" and "+s2+" are not equal..");
		}
	}
}
