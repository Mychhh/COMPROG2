package filePath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativePathSample {

	public static void main(String[] args) {

		
		Path filePath = Paths.get("C:\\Java\\Documents\\Music.txt");
		int count = filePath.getNameCount();
		
		System.out.println("Path is      : " + filePath.toString());
		System.out.println("File name is : " + filePath.getFileName() + "\n");
		System.out.println("There are " + count + " elements in the file path" );

		for(int x = 0; x < count; x++) 
		{
			System.out.println("Element " + x + " is " + filePath.getName(x));
		}
		
	}

}
