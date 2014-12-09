package home.rico.crewanalyzer;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;


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
	
	public static void readRecords() {
		String pattern = "\"[^\"]*\"";
		
		input.useDelimiter("\t");
		try {
			while (input.hasNext()) {
				System.out.printf(
					"%-8d%-100s%-50s%-15s%-15s%-15s", 
					input.nextInt(),
					input.next(),
					input.next(),
					input.next(),
					input.next(),
					input.next()
				);
			}
		
		}catch (NoSuchElementException elementException) {
			System.err.println("File Improper form ");
		}catch (IllegalStateException stateException) {
			System.err.println("error reading ");
		}
	}
	
	public static void closedFile() {
		if (input != null) {
			input.close();
		}
	}
	
}
