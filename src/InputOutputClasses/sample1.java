package InputOutputClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class sample1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream FIS = new FileInputStream("C:\\Java\\Documents\\Hotdog.txt");

		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

	}

}
