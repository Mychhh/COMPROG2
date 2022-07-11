package TryCatchFinal;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends Exception
//I made this class to handle an Invalid answer
{
	public InvalidInputException()
	{
		super("You have entered a number! Try again!");
		//This message will print if the user entered an invalid answer
	}
}

public class Sample {

	public static void main(String[] args) {
		
	Scanner s =  new Scanner(System.in);	
	
	System.out.println("Enter your name : ");
	
	try
	{
		int num =  s.nextInt();	
		if(num != 1) 
		{
			throw new InputMismatchException();
		}
		else
		{
			throw new InvalidInputException();
		}
	}
	catch(InvalidInputException IIE)
	{
		System.out.println(IIE);
	}
	
	catch(InputMismatchException IME)
	{
		System.out.println(IME);
	}
	finally
	{
		System.out.println("Thankyou for your time");
	}

	}

}
