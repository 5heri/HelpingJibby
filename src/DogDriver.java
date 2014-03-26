import java.util.Scanner;   


public class DogDriver{
	
  public static void main(String[] args){
	  
    System.out.println("Enter an int > 3: size of the track");     
    Scanner s = new Scanner(System.in);      
    int trackSize = s.nextInt();
    System.out.println("track Size: " + trackSize);      
    DogTrack d = new DogTrack(trackSize);      
    d.playGame();      
  } 
  
}   
