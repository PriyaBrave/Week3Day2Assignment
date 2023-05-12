package week3.day2.assignments;

import java.util.Collections;
import java.util.LinkedList;

public class FindingSecondLargestUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> nums = new LinkedList<Integer>();
		
		nums.add(3);
		nums.add(2);
		nums.add(11);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		
		Collections.sort(nums);
		
		System.out.println("Sorted Elements:");
		for(int i:nums) {
			System.out.print(i+"\t");
		}
		int len = nums.size();
		System.out.println("\n");
		System.out.println("Second Largest of the Elements: "+nums.get(len-2));
	}

}
