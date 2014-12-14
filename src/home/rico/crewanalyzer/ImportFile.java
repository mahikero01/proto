package home.rico.crewanalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//class for opening and reading file "fil.text"
public class ImportFile {

	private BufferedReader buffer;
	private ArrayList<CrewInfo> crewListTemp;
	
	public ImportFile(ArrayList<CrewInfo> crewListRef) {
		crewListTemp = crewListRef;
	}
	
	public ArrayList<CrewInfo>  run() {
		openFile();
		readRecords();
		closedFile();
		
		return this.crewListTemp;
	}
	
	//open file "fil.txt"
	private void openFile() {
		try {
			buffer = new BufferedReader(new FileReader("fil.txt"));
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating. ");
			System.exit(1);
		}
	}
	
	//read records of file
	private void readRecords() {
		String line = "";
		
		try {
			while ( (line = buffer.readLine()) != null ) {
				String[] currentCrewRaw = line.split("\t");
				CrewInfo currentCrew = new CrewInfo();
				currentCrew.setPin(currentCrewRaw[0]);
				currentCrew.setName(currentCrewRaw[1]);
				currentCrew.setRank(currentCrewRaw[2]);
				currentCrew.setDatePromoted(currentCrewRaw[3]);
				currentCrew.setDateOfBirth(currentCrewRaw[4]);
				
				if (currentCrewRaw.length == 6) {
				currentCrew.setStartEmployment(currentCrewRaw[5]);
				} else {
					currentCrew.setStartEmployment(null);
				}
				
				this.crewListTemp.add(currentCrew);
				currentCrewRaw = null;
				currentCrew = null;
			}
		} catch (IOException ioException) {
			System.err.println("IO error");
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException out){
			out.printStackTrace();
		}
	}
	
	//close file stream buffer
	private void closedFile() {
		if (buffer != null) {
			try {
				buffer.close();
			} catch (IOException ioException) {
				System.err.println("IO error");
			}
		}
	}
}