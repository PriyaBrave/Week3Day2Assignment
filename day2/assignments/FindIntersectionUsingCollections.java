package week3.day2.assignments;

import java.util.LinkedList;

public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> val1 = new LinkedList<Integer>();

		val1.add(3);
		val1.add(2);
		val1.add(11);
		val1.add(4);
		val1.add(6);
		val1.add(7);

		System.out.println("First Set of Elements: ");
		for (int i : val1) {
			System.out.print(i+"\t");
		}

		LinkedList<Integer> val2 = new LinkedList<Integer>();

		val2.add(1);
		val2.add(2);
		val2.add(8);
		val2.add(4);
		val2.add(9);
		val2.add(7);

		System.out.println();
		
		System.out.println("Second Set of Elements: ");
		for (int j : val2) {
			System.out.print(j+"\t");
		}
		
		val1.retainAll(val2);
		
		System.out.println("\nCommon Elements: ");
		for(int r: val1) {
			System.out.print(r+"\t");
		}
	}

}
