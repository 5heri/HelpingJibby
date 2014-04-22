import java.util.Scanner;


public class TryAndCatch {

	public static void main(String[] args) {
		
		String[] array = new String[10];  
		for (int i = 0; i < array.length; i++) {   
			array[i] = "In Array";
		}
		
		Scanner in = new Scanner(System.in);    
		int index = in.nextInt();              
		
		try {
			System.out.println(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bounds");	
		}
	}
}
 