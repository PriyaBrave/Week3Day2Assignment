package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharactersUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String compname = "google";
		String result =" ";
		
		char[] ch = compname.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			if(unique.add(ch[i])) {
				result = result + ch[i];
			}
		} 
		System.out.println(result);
	}
}
