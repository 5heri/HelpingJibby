import java.io.IOException;
import java.util.StringTokenizer;

public class DenseScrabble extends Echo {

	private final int[] charScore = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1,
			1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
	private int count;
	double maxScore = 0;
	String maxWord = null;
	int maxLineCount = 0;

	public DenseScrabble(String f) throws IOException {
		super(f);
		count = 0;
		maxScore = 0;
		maxWord = null;
		maxLineCount = 0;
	}

	public void readLines() {
		while (scan.hasNext()) {
			count++;
			processLine(scan.nextLine());
		}
		scan.close();
		System.out.println("winner:" + maxWord + " score" + maxScore
				+ " Line number:" + maxLineCount);
	}

	public void processLine(String line) {
		StringTokenizer s = new StringTokenizer(line);

		while (s.hasMoreTokens()) {
			String currWord = s.nextToken();
			double currScore = getWordScore(currWord.toLowerCase());
			if (maxScore < currScore) {
				maxScore = currScore;
				maxWord = currWord;
				maxLineCount = count;
			}
		}

	}

	private double getWordScore(String s) {
		double score = 0;
		for (int i = 0; i < s.length(); i++) {
			score += getCharScore(s.charAt(i));
		}
		return score / s.length();
	}

	private int getCharScore(char c) {

		try {
			return charScore[c - 97];
		} catch (IndexOutOfBoundsException e) {
			return 0;
		}
	}

}