package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindingDuplicatesUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(14,12,13,11,14,15,18,12,20,19,18,16,14));

		/*nums.add(14);
		nums.add(12);
		nums.add(13);
		nums.add(11);
		nums.add(15);
		nums.add(14);
		nums.add(18);
		nums.add(16);
		nums.add(17);
		nums.add(19);
		nums.add(18);
		nums.add(17);
		nums.add(20);*/
		
		ArrayList<Integer> present = new ArrayList<Integer>();
		ArrayList<Integer> absent = new ArrayList<Integer>();
		
		for (Integer l : nums) {
			if(!present.contains(l)) {
				present.add(l);
			} else {
				absent.add(l);
			}
		}
		HashSet<Integer> dups = new HashSet<Integer>(absent);
		System.out.println("\nDuplicates: Using ArrayList: "+dups);
		
		HashSet<Integer> checklist = new HashSet<Integer>();
		HashSet<Integer> duplist = new HashSet<Integer>();
		
		for (Integer setdup : nums) {
			if(!checklist.add(setdup)) {
				duplist.add(setdup);
			}
		}
		
		System.out.println("Duplicates: Using HashSet: "+duplist);
		
		/*System.out.println("\nDuplicate Elements:");
		for(int i =0;i < nums.size()-1;i++) {
			for (int j = 0; j < nums.size(); j++) {
				if(nums.get(i) == nums.get(j) && i != j) {
					dup.add(nums.get(i));
					break;
				}
			}
		}
		List<Integer> result = new ArrayList<Integer>(dup);
        Collections.sort(result);
		System.out.println(result+" ");*/
		
	}
	//14,17,18
}
