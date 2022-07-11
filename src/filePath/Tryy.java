package filePath;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Tryy {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		PrintWriter outputStream = null;
		//String filename = "out.txt";
		Path inputPath = Paths.get("out.txt");
		Path fullPath = inputPath.toAbsolutePath();
		String filename = fullPath.toString();
		System.out.println (filename);

		try
		{
		//outputStream = new PrintWriter(new FileOutputStream("C:\\Users\\MagpayoArlene(Faculty\\OneDrive - STI Education Services Group, Inc\\SY2021-2022\\OOP\\Java\\out.txt"));
		outputStream = new PrintWriter(new FileOutputStream(filename));
		}
		
		catch (FileNotFoundException e)
		{
		System.out.println("Error Opening the file out.txt");
		System.exit(0);
		}
		
		System.out.println("Enter three lines of Text:");
		String line = null;
		int count;
		for(count =1;count<=3;count++)
		{
		line = s.nextLine();
		outputStream.println(count + " " + line);
		}
		outputStream.close();
		System.out.println("Those lines were written to out.txt");
		

	}
}
