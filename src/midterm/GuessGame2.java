package midterm;

import java.util.Scanner;
import java.util.Random;

public class GuessGame2 {

	public static void main(String[] args) {
		
		Random  r = new Random();
		Scanner s = new Scanner(System.in);

		
		String[] words = {"LUGAW", "ASSIGNMENT", "QUIZ", "ACTIVITY", "PANCIT CANTON"};//Words to guess
		
		int num = r.nextInt(words.length);//it will randomly generate a number from 0 to 4
		boolean loop =  true;// this boolean will be used to identify if the system will stop or not 
		
		//do while loop 
		do  
		{
			String toGuess = words[num]; 		
/*
	    the specific value in the array ' words' will be stored in 'toGuess' 
	    so that i can modify it easily
		and the num will randomly give a number so that the system will give different words to guess
*/
			if (toGuess.equals(words[0])) 
			{
				while(loop) {
					String Ans = toGuess;
					Ans= "L?G?W";//The value of toGuess word will change
					System.out.println("                -"+Ans+"-");
					System.out.println("Guess a letter that will complete tha word");
					System.out.print("->");
					char guess1 = s.next().charAt(0);
					System.out.print("->");
					char guess2 = s.next().charAt(0);
					
					if (guess1 == 'U' && guess2 == 'A' )
					{
						System.out.println("You Got the right Answer " + toGuess );
						loop = false;//if the user got the right answer the system will stop
					}
					else if(guess1 == 'U' && guess2 != 'A')
					{
						System.out.println("Your Second answer is Incorrect, Try Again");
					}
					else if(guess1 != 'U' && guess2 == 'A')
					{
						System.out.println("Your first answer is Incorrect, Try Again");
					}
					else 
					{
						System.out.println("Wrong Answer, Try Again");
					}
				}				
			}
			else if (toGuess.equals(words[1])) 
			{	
				while(loop) 
				{
					String Ans = toGuess;
					Ans= "ASS?NEN?";//The value of toGuess word will change
					
					System.out.println("                -"+Ans+"-");
					System.out.println("Guess a letter that will complete tha word");
					System.out.print("->");
					char guess1 = s.next().charAt(0);
					System.out.print("->");
					char guess2 = s.next().charAt(0);
					
					if (guess1 == 'I' && guess2 == 'T' )
					{
						System.out.println("You Got the right Answer " + toGuess );
						loop = false;//if the user got the right answer the system will stop
					}
					else if(guess1 == 'I' && guess2 != 'T')
					{
						System.out.println("Your Second answer is Incorrect, Try Again");
					}
					else if(guess1 != 'I' && guess2 == 'T')
					{
						System.out.println("Your first answer is Incorrect, Try Again");
					}
					else 
					{
						System.out.println("Wrong Answer, Try Again");
					}
				}				
			}
			else if (toGuess.equals(words[2])) 
			{
				while(loop) 
				{
					String Ans = toGuess;
					Ans= "Q??Z";//The value of toGuess word will change
					
					System.out.println("                -"+Ans+"-");
					System.out.println("Guess a letter that will complete tha word");
					System.out.print("->");
					char guess1 = s.next().charAt(0);
					System.out.print("->");
					char guess2 = s.next().charAt(0);
					
					if (guess1 == 'U' && guess2 == 'I' )
					{
						System.out.println("You Got the right Answer " + toGuess );
						loop = false;//if the user got the right answer the system will stop
					}
					else if(guess1 == 'U' && guess2 != 'I')
					{
						System.out.println("Your Second answer is Incorrect, Try Again");
					}
					else if(guess1 != 'U' && guess2 == 'I')
					{
						System.out.println("Your first answer is Incorrect, Try Again");
					}
					else 
					{
						System.out.println("Wrong Answer, Try Again");
					}
				}				
			}
			else if (toGuess.equals(words[3])) 
			{
				while(loop) 
				{
					String Ans = toGuess;
					Ans= "?CTIVIT?";//The value of toGuess word will change
					
					System.out.println("                -"+Ans+"-");
					System.out.println("Guess a letter that will complete tha word");
					System.out.print("->");
					char guess1 = s.next().charAt(0);
					System.out.print("->");
					char guess2 = s.next().charAt(0);
					
					if (guess1 == 'A' && guess2 == 'Y' )
					{
						System.out.println("You Got the right Answer " + toGuess );
						loop = false;//if the user got the right answer the system will stop
					}
					else if(guess1 == 'A' && guess2 != 'Y')
					{
						System.out.println("Your Second answer is Incorrect, Try Again");
					}
					else if(guess1 != 'A' && guess2 == 'Y')
					{
						System.out.println("Your first answer is Incorrect, Try Again");
					}
					else 
					{
						System.out.println("Wrong Answer, Try Again");
					}
				}				
			}
			else if (toGuess.equals(words[4])) 
			{
				while(loop) 
				{
					String Ans = toGuess;
					Ans= "?ANCIT ?ANTON";//The value of toGuess word will change
					
					System.out.println("                -"+Ans+"-");
					System.out.println("Guess a letter that will complete tha word");
					System.out.print("->");
					char guess1 = s.next().charAt(0);
					System.out.print("->");
					char guess2 = s.next().charAt(0);
					
					if (guess1 == 'P' && guess2 == 'C' )
					{
						System.out.println("You Got the right Answer " + toGuess );
						loop = false;//if the user got the right answer the system will stop
					}
					else if(guess1 == 'P' && guess2 != 'C')
					{
						System.out.println("Your Second answer is Incorrect, Try Again");
					}
					else if(guess1 != 'P' && guess2 == 'C')
					{
						System.out.println("Your first answer is Incorrect, Try Again");
					}
					else 
					{
						System.out.println("Wrong Answer, Try Again");
					}
				}				
			}
			
		}
		while(loop);

	}

}

//200 HAHAHHAHA