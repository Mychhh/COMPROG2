package midterm;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame
{
    public static void main(String[] args) 
    {
     int[] num = new int[50];
     
     for(int i = 0; i < num.length; i++) //This will represent the specific range of guess number
     {
    	num[i] = i+1;
     }
     
     Scanner s = new Scanner(System.in); 
     Random random = new Random();
    
     int luckyNumber = random.nextInt(num.length)+1; //luckyNumber
     int guessNumber; //number guess of the user
     int attemptNumber = 0;

	 System.out.println("Guess a number from 1 to 50!");

     while(true) {
    	 try {
    		 System.out.print("->");
    	     guessNumber =  s.nextInt();
    	     System.out.println();
    	     attemptNumber ++;
    	     
    		 guessNumber = num[guessNumber-1];//the guess number will be stored to specific range of number
    		 
    		 if(guessNumber > luckyNumber)
    		 {
    			 System.out.println("Too high, Try again");
    			 
    		 }
    		 else if(guessNumber < luckyNumber)
    		 {
    			 System.out.println("Too low, Try again");
    		 }
    		 else if(guessNumber == luckyNumber)// the program will stop if the user got the lucky number
    		 {
    			 System.out.println("YOU GOT A LUCKY NUMBER!");
    			 System.out.println("You got it in "+ attemptNumber +" attempt(s)"  );
    			 break;
    		 }	 
 		}
 		catch(ArrayIndexOutOfBoundsException AIOOBE )//if the user entered a number higher than 50 or 0 
 		{
 			System.out.println("Guess a number from 1-50!");
 			System.out.println("Try Again");
 		}
    	 catch(InputMismatchException IME)//if the user entered a letter or word
  		{
    		System.out.println();
  			System.out.println("Invalid Input");
  			System.out.println("Try again");
  			s.nextLine();//I added this input so that if the user entered a letter it will not loop  
  		} 
    	
     }    
}
}