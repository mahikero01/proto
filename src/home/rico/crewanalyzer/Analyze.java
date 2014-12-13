package home.rico.crewanalyzer;

import java.util.ArrayList;

public class Analyze {

	public static void main(String[] args) {
		ArrayList<CrewInfo> crewList =  new ArrayList<CrewInfo>();
		
		ImportFile.openFile();
		ImportFile.readRecords(crewList);
		ImportFile.closedFile();
	}

}
