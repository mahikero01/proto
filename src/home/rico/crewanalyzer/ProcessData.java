package home.rico.crewanalyzer;

import java.util.ArrayList;

//data processing class
public class ProcessData {
	
	private ArrayList<CrewInfo> crewList;
	private ArrayList<String> crewRank;
	
	public ProcessData() {
		crewList = new ArrayList<CrewInfo>();
		crewRank = new ArrayList<String>();
	}
	
	public void run() {
		ImportFile importFile = new ImportFile(crewList);
		crewList = importFile.run();
		
		crewRank = DataMiner.mineRank(crewList);
	}

}