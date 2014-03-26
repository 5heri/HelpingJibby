
public class SevenTally {
	
	private int[] diceScoreTracker;

	public SevenTally(int diceCount) {
		diceScoreTracker = new int[diceCount];
	}

	/* Simulates dice throws until sum is 7 or 
	   dice run out */
	public boolean experiment() {
		int sum = 0;

		for (int i = 0; i < diceScoreTracker.length; i++) {
			diceScoreTracker[i] = 1 + (int)(6 * Math.random());

			/* Loop through current scores and check if any add
			   up to 7 when compared to the newly inserted score */
			/* With this method, the newly added value is compared
			   to itself as well, but since 3+3 != 7 and 4+4 != 7
			   it makes no difference. To avoid, simply add continue
			   statement if i = j.*/
			int j = 0;
			while (j < diceScoreTracker.length && diceScoreTracker[j] != 0) {
				if (diceScoreTracker[i] + diceScoreTracker[j] == 7) {
					return true;
				}
				j++;
			}
		}

		return false;
	}

}
