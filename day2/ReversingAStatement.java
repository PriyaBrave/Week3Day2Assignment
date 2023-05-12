package week3.day2;

public class ReversingAStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Amazon development centre , Chennai";
		
		//To Lowercase
		String lcase = input.toLowerCase();
		
		//Spliting with White Spaces
		String[] s = lcase.split(" ");
		
		//Reversing
		System.out.println("Reversed Statement: ");
		for (int i = s.length-1;i >= 0;i--) {
			System.out.print(s[i]+" ");
		}
			
	}

}
