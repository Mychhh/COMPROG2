package filePath;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AbsolutePathSample {

	public static void main(String[] args) {
		
		String fileName;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Filename : ");
		fileName = s.nextLine();
		
		Path inputPath = Paths.get(fileName);
		Path fullPath = inputPath.toAbsolutePath();
		System.out.println("The full path is \n" + fullPath.toString());

	}

}
