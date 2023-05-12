package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> comp = new ArrayList<String>();
		
		comp.add("HCL");
		comp.add("Wipro");
		comp.add("Aspire Systems");
		comp.add("CTS");
		
		System.out.println("No. of elements/ Length of Array: "+comp.size());
		
		System.out.println("Before Reversed Order:");
		Collections.sort(comp);
		
		System.out.println("After Reversed Order:");
		Collections.reverse(comp);
		
		String commaseparated = String.join(",", comp);
		System.out.println(commaseparated);
		
	}

}
