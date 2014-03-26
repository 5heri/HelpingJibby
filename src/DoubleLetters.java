import java.util.Scanner;

public class DoubleLetters {
	
	private final char SPECIAL_CHAR_EXCALAM = '!';
	
	public void DoDoubling() {
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		int length = input.length();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < length; i++) {
			sb.append(input.charAt(i));
			if (isAlphabet(input.charAt(i))) {
				sb.append(input.charAt(i));
			} 
			if (input.charAt(i) == SPECIAL_CHAR_EXCALAM) {
				sb.append(input.charAt(i));
				sb.append(input.charAt(i));
			}
		}
		System.out.println(sb);
	}
	
	private boolean isAlphabet(char chr) {
		int asciiChar = chr;
		return (asciiChar >= 65 && asciiChar <= 90) 
				|| (asciiChar >= 97 && asciiChar <= 122);
	}
}