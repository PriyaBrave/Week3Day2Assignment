package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		// Input
		String name = "Priya Narayanaswamy";
		
		//Converting to char array
		char[] ch = name.toCharArray();
		
		System.out.println("Input String: "+name);
		System.out.println("Reversed String: ");
		for(int i = ch.length-1;i >= 0;i--) {
			System.out.print(ch[i]);
		}
	}

}
