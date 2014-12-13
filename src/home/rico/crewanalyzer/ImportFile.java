package home.rico.crewanalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class ImportFile {

	private static BufferedReader buffer;
	
	
	public static void openFile() {
		try {
			buffer = new BufferedReader(new FileReader("fil.txt"));
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating. ");
			System.exit(1);
		}
	}
	
	public static ArrayList<CrewInfo> readRecords(ArrayList<CrewInfo> crewListPara) {
		//CrewInfo currentCrew = new CrewInfo();
		String line = "";
		String[] currentCrewRaw;
		
		try {
			while ( (line = buffer.readLine()) != null ) {
				currentCrewRaw = line.split("\t");
				CrewInfo currentCrew = new CrewInfo();
				currentCrew.setPin(currentCrewRaw[0]);
				currentCrew.setName(currentCrewRaw[1]);
				currentCrew.setRank(currentCrewRaw[2]);
				currentCrew.setDatePromoted(currentCrewRaw[3]);
				currentCrew.setDateOfBirth(currentCrewRaw[4]);
				currentCrew.setStartEmployment(currentCrewRaw[5]);
				
				crewListPara.add(currentCrew);
			}
		} catch (IOException ioException) {
			System.err.println("IO error");
		}
		
		return crewListPara;
	}
	
	public static void closedFile() {
		if (buffer != null) {
			try {
				buffer.close();
			} catch (IOException ioException) {
				System.err.println("IO error");
			}
		}
	}
	
}
