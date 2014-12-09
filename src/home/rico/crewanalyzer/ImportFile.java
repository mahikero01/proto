package home.rico.crewanalyzer;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


public class ImportFile {

	private static Scanner input;
	
	public static void openFile() {
		try {
			input = new Scanner(Paths.get("fil.txt"));
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating. ");
			System.exit(1);
		}
	}
	
}
