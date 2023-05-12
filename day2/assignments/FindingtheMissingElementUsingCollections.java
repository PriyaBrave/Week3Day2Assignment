package week3.day2.assignments;

import java.util.Collections;
import java.util.LinkedList;

public class FindingtheMissingElementUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> nums = new LinkedList<Integer>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		nums.add(8);

		Collections.sort(nums);

		System.out.println("Sorted Elements:");
		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int len = nums.size();
		System.out.println("\nMissing Element:");
		
		for(int i =0;i<=len-1;i++) {
			if(nums.get(i) != i+1) {
				System.out.print(i+1);
				break;
			}
		}
	}

}
