package midterm;
import java.util.Scanner;

class NoInputException extends Exception
//I made this class to handle a blank answer by the user
{
	public NoInputException()
	{
		super("You dont have any answer \nTry Again!");
		//This message will print if the user entered a blank answer
	}
}

class NumberInputException extends Exception
//I made this class to handle an Invalid answer
{
	public NumberInputException()
	{
		super("You have entered a Number or Special character \nPlease choose A,B,C only");
		//This message will print if the user entered a number or special character
	}
}
class InvalidInputException extends Exception
//I made this class to handle an Invalid answer
{
	public InvalidInputException()
	{
		super("You have entered an invalid answer \nPlease choose A,B,C only");
		//This message will print if the user entered an invalid answer
	}
}


public class QuizBee {

	public static void main(String[] args) {
		
	String[] questions = new String[10];//Questions
	questions[0] = "1. In DreamWorks’ animated film, Shrek, what is the name of Shrek’s wife? \na) Leni  b) Pipay  c) Fiona* ";
	questions[1] = "2. Complete the statement. Wake me up... \na) wake me up.. inside* b) wake me up.. when september ends c) wake me up.. before you go ";
	questions[2] = "3. Which Planet Is The Hottest In The Solar System? \na) Mercury  b) Venus*  c) Earth";
	questions[3] = "4. What Is The Resolution Of The Human Eye? \na) 576 Megapixels*  b) 555 Megapixels  c) 666 Megapixels";
	questions[4] = "5. What is the current population of the world? \na) 7.8 billion*  b) 8 billion  c) 7.5 billion";
	questions[5] = "6. Philippines population was estimated __________ As of 1 January 2021 \na) 110,573,666  b) 110,573,819*  c) 11,573,819 ";
	questions[6] = "7. What is the name of the world’s largest island? \na) Yellowland  b) Iceland c) Greenland*";  
	questions[7] = "8. Scooby-Doo and his friends travel around in a vehicle called? \na) The Mystery Machine*  b) Ghost Rider  c) Spaceship";
	questions[8] = "9. Who killed lapu-lapu? \na) Layla   b) Gusion  c) Unknown*  ";
	questions[9] = "10. How many second a day? \na) 66400  b) 86400* c) 69400";
	
	String[] answers = {"C","A","B","A","A","B","C","A","C","B"}; //Answers
	String[] ans = new String[10]; // in this array i will store the users answer
	
	int rightAns = 0;
	boolean loop = true;
	
	Scanner s = new Scanner(System.in);
	
		for(int i = 0; i < 10; i++)//this for loop will print all the questions
		{
			while(loop)
			{
			try 
			{ //Note: I will compare the users answer to the right answer using their index number
				System.out.println(questions[i]);
				ans[i] = s.nextLine();	
				
				  //if the users answers is equal to A,B,orC
					if(ans[i].equalsIgnoreCase("A")||ans[i].equalsIgnoreCase("B")||ans[i].equalsIgnoreCase("C"))
					{ 
					  //if the users answers is equal to right answer
						if(ans[i].equalsIgnoreCase(answers[i]))
						{
							rightAns++;		
							break; //the loop will stop
						}
						else{
							break; //the loop will stop anyways, because the users answer is still valid
						}

					}
				  //if the user dont have any answer it will throw an exception
					else if(ans[i].equals(""))
					{
						throw new NoInputException();
					}
				  //if the users answer is number it will throw an exception	
					else if(ans[i].charAt(0) == '0' || ans[i].charAt(0) == '1' || ans[i].charAt(0) == '2' || ans[i].charAt(0) == '3'|| ans[i].charAt(0) == '4' || ans[i].charAt(0) == '5'|| ans[i].charAt(0) == '6'|| ans[i].charAt(0) == '7' || ans[i].charAt(0) == '8'|| ans[i].charAt(0) == '9')
					{
						throw new NumberInputException();
					}
				  //if the users answer is invalid/ it will throw an exception 
					else {
						throw new InvalidInputException();
					}
				  //the system will ask again the user to answer the specific question all over again
				  //until its answer gets valid because it is inside a while loop
					
			}
			
			catch(NoInputException NoIE)
			{
				System.out.println(NoIE.getMessage());
			}
			catch(NumberInputException NIE)
			{
				System.out.println(NIE.getMessage());
			}
			catch(InvalidInputException IIE)
			{
				System.out.println(IIE.getMessage());
			}
		}
		
		}		

		System.out.println("Your right answer is " + rightAns);
	
	
}	
}