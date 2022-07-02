
public class Test {

	public static void main(String[] args) {
		reverseString(args[0]);
	}
	
	private static void reverseString(String stringToReverse) {
		String[] words = stringToReverse.split(" ");
		for (int i=words.length-1; i>= 0; i--) {
			System.out.print(words[i]);
			if (i != 0) System.out.print(" ");
		}
	}
}
