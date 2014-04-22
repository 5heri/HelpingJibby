import java.io.IOException;
import java.util.Scanner;

public class DenseScrabbleTester {

	public static void main(String[] args) throws IOException {
		String fileName;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a file name");
		fileName = scan.nextLine();
		try {
			DenseScrabble ds = new DenseScrabble(fileName);
			ds.readLines();
		} catch (IOException e) {
			System.out.println("File not found.");
		}
	}
}