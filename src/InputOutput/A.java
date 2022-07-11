package InputOutput;

//This is a Sample program that shows - Path Methods

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A 
{

	public static void main(String[] args) 
	{
		
		//this is an absolute path
		Path filePath = Paths.get("C:\\Users\\Hotdog\\SelfLearning\\IO\\src\\InputOutput\\Hello_World.txt");
		
		//this will show how many element are in the path
		int count = filePath.getNameCount();
		
		System.out.println("Path is      -> " + filePath.toString());                //this will just convert the absolute path to String
		System.out.println("File name is -> " + filePath.getFileName());             //this will get the file name of our file
		System.out.println("\nThere are " + count + " elements in the file path\n"); ////this will show how many element are in the path
		
		//print every element
		for(int i = 0; i < count; i++) 
		{
			System.out.println("Element " + i + " is " + filePath.getName(i));
		}

	}

}
