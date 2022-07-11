package midterm;

import java.io.*;
import java.nio.file.*;
import java.util.Random;
import java.util.Scanner;

public class GuessGameReference {

		       public GuessGameReference(){         
		       String fileName = ("C:\\Java\\Documents\\Hotdog");
		       Path filePath = Paths.get(fileName.toString()); 
		       String n = null;
		       String array [] = new String[3];
		       int count = 0;
		       Random r = new Random();
		       String array2 [] = new String[count];
		       array2 = array;
		       char qMark = '?';
		       Scanner sc = new Scanner(System.in);
		       boolean f = false;
		  
		    try{
		       InputStream input = Files.newInputStream(filePath);
		       BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		      
		    while(null != (n = reader.readLine())){
		       array [count] = n;
		       count++;
		       }    
		    
		       String Words = array2[r.nextInt(count)];
		       String displayLetters = Words;
		       
		    for(int i = 0; i < Words.length()-4; i++){
		       displayLetters = displayLetters.replace(displayLetters.charAt(r.nextInt(displayLetters.length())), qMark);      
		       }
		    
		    while(true){
		       System.out.println("Guess the missing letters of " + displayLetters);
		       System.out.print("Enter your guess letter(s): ");
		       String enterGuess = sc.nextLine().toUpperCase();
		    
		    if(enterGuess.equals(displayLetters)){
		       System.out.println("Congratulations! The word has been deduced.");    
		       break;
		       }
		    
		    else{
		       f = false;
		       
		    for(int i = 0; i < Words.length(); i++){    
		    if(enterGuess.equalsIgnoreCase(String.valueOf(Words.charAt(i)))){
		       displayLetters = displayLetters.substring(0, i) + enterGuess + displayLetters.substring(i + 1);
		       f = true;    
		       }    
		      }    
		     }
		     
		    if(f == true){
		       System.out.println(enterGuess.toUpperCase() + " is along with the missing letters.");
		       }
		    
		    else{
		       System.out.println(enterGuess.toUpperCase() + " is not along with the missing letters.");    
		       }    
		      }
		     }
		   
		    catch(Exception E){
		       System.out.println(E.getMessage());    
		       }    
		      }
		    

		   	public static void main(String[] args) {
		       new GuessGameReference();  
		   	}

	}

