package InputOutput;

//This program will show how to convert relative path to absolute path

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class B 
{

	public static void main(String[] args) 
	{
		
		String fileName;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a filename : ");
		fileName = s.nextLine();
		
		Path inputPath = Paths.get(fileName);
		
		Path fullPath  = inputPath.toAbsolutePath();
		
		System.out.println("The full path is " + fullPath.toString());
		
	}

}
