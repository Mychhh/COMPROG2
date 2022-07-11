package filePath;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class SampleFile {

	public static void main(String[] args) throws IOException
	{ 
		                    //this is the filepath of the text   
		File file = new File("C:/Java/Documents/Music.txt"); 
		Scanner s =  new Scanner(file);//i will scan the text inside a Mucic.txt file
		
		String fileContent = "";
		
		while(s.hasNextLine()) //while the textFile has next line it will run
		{
		  //The text inside a Music.txt file will concatenate to a new file which is MusicCopy.txt file
			fileContent = fileContent.concat(s.nextLine() + "\n");
		}
		
		FileWriter writer =  new FileWriter("C:/Java/Documents/MusicCopy.txt");
		writer.write(fileContent);
		writer.close();

	}

}
