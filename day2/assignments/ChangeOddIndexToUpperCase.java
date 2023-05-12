package week3.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "changeme";
		String result = "";
		char[] charr = input.toCharArray();
		for (int i = 0; i < charr.length; i++) {
			if (i % 2 == 0) {
				 result = result + Character.toUpperCase(charr[i]);
			} else {
				result = result + Character.toLowerCase(charr[i]);
			}
		}
		System.out.println("Input String: "+input);
		System.out.println("Odd Index To UpperCase String: "+result);
	}
}
