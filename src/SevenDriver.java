import java.util.Scanner; 

public class SevenDriver {       

  public static void main(String[] args) {

    System.out.println("Enter number of dice to toss");

    Scanner s = new Scanner(System.in);      
    int diceCount = s.nextInt(); 

    SevenTally t = new SevenTally(diceCount);

    int experiments = 1000000;
   // int experiments = 1;
    int wins = 0;
    for(int j = 0; j < experiments; j++)
      if(t.experiment()) wins++;
    System.out.println((double)wins/experiments);
    //t.experiment();
        
  } 

}   
