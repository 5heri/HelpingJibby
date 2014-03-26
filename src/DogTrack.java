
public class DogTrack {
	
	private int tracksize;
	private int posFido;
	private int posSpot;
	private int posRover;
	
	public DogTrack(int tracksize) {
		this.tracksize = tracksize;
		posFido = 0;
		posSpot = 0;
		posRover = 0;
	}
	
	private int spin() {
		return (int) (Math.random() * 5 + 1);
	}
	
	private void move() {
		int randFido = spin();
		int randSpot = spin();
		int randRover = spin();
		
		if ((tracksize/2 == randFido) || ((2*tracksize)/3 == randFido)) {
			if (posFido > 0) {
				posFido--;
			}
		} else {
			posFido += randFido;
			if (posFido > tracksize - 1) {
				posFido = tracksize - 1;  
			}
		}
		if ((tracksize/2 == randSpot) || ((2*tracksize)/3 == randSpot)) {
			if (posSpot > 0) {
				posSpot--;
			}
		} else {
			posSpot += randSpot;   
			if (posSpot > tracksize - 1) {
				posSpot = tracksize - 1;  
			}
		}
		if ((tracksize/2 == randRover) || ((2*tracksize)/3 == randRover)) {
			if (posRover > 0) {
				posRover--;
			}
		} else {
			posRover += randRover;
			if (posRover > tracksize - 1) {
				posRover = tracksize - 1;  
			}
		}
	}
	
	private boolean isOver() {
		int end = tracksize -1;
		return (posFido >= end || posSpot >= end || posRover >= end);
	}
	
	private void showTrack() {
		int counter = 0;
		while(counter < tracksize) {
			if (posFido == counter) {
				System.out.print('F');
			} else {
				System.out.print('o');
			}
			counter++;
		}
		System.out.println();
		
		counter = 0;
		while(counter < tracksize) {
			if (posSpot == counter) {
				System.out.print('S');
			} else {
				System.out.print('o');
			}
			counter++;
		}
		System.out.println();
		
		counter = 0;
		while (counter < tracksize) {
			if (posRover == counter) {
				System.out.print('R');
			} else {
				System.out.print('o');
			}
			counter++;
		}
		System.out.println();
		for (int i = 0; i < tracksize; i++) {
			System.out.print('-');
		}
		System.out.println();  // 
	}
	
	private void showWinners() {  
		if (posFido >= tracksize -1) {
			System.out.println("Fido Wins!");
		}									
		if (posSpot >= tracksize -1) {
			System.out.println("Spot Wins!");
		}
		if (posRover >= tracksize -1) {
			System.out.println("Rover Wins!");
		}
		
	}
	
	public void playGame() {
		while (!isOver()) {   
			showTrack();  
			move();        
		}
		showTrack();
		showWinners();
	}

}
