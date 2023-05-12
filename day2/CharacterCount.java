package week3.day2;

public class CharacterCount {

	public static void main(String[] args) {
		// Input...
		String input = "Priya Narayanaswamy";
		//char find = 'a';
		int count = 0;

		// Converting to char array
		char[] ch = input.toCharArray();
		
		System.out.println("Input String: "+input);
		System.out.print("No. of 'a's in the String: ");
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				count++;
			}
		}
		System.out.print(count);
	}

}
