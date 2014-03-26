

/*   Write a program in a single class called DoubleLetters that does the following: 
	The program should read in a single line of text from the keyboard. 
	It should then print to the console the same line of text, only now with every letter doubled. 
	Other characters in the line should be left alone, except for exclamation points (!): 
		These should be tripled. 

Example: if the input line is:
Hey! My car can't move!!

Then your program should print:
HHeeyy!!! MMyy ccaarr ccaann'tt mmoovvee!!!!!!   */ 


public class Main {

	public static void main(String[] args) {
		//DoubleLetters dl = new DoubleLetters();
		//dl.DoDoubling();
		UpByN ubn = new UpByN();
		ubn.upByThrees(4);
	}

}
