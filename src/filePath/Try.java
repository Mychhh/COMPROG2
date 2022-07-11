package filePath;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Try {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		System.out.println("Enter filename: ");
		String filenames = s.nextLine();
		
		Path inputpath = Paths.get(filenames);
		Path fullpath = inputpath.toAbsolutePath();
		
		String filename = fullpath.toString();

		try
		{
		BufferedReader inputStream = new BufferedReader(new FileReader(filename));
		String line = null;
		
		line=inputStream.readLine();
		System.out.println("The First line in  : " + filenames + " is: ");
		System.out.println(line);
		line=inputStream.readLine();
		
		System.out.println("The Second line in : " + filenames + " is: ");
		System.out.println(line);
		line=inputStream.readLine();
		
		System.out.println("The Third line in  : " + filenames + " is: ");
		System.out.println(line);
		inputStream.close();
		}
		
		catch (IOException e)
		{
		System.out.println("Error reading from the file " + filename);
		}

		
	}

}
