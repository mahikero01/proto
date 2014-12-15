package home.rico.crewanalyzer;

import java.util.ArrayList;

//data processing class
public class ProcessData {
	
	private ArrayList<CrewInfo> crewList;
	private ArrayList<RankInfo> rankList;
	
	public ProcessData() {
		crewList = new ArrayList<CrewInfo>();
		rankList = new ArrayList<RankInfo>();
	}
	
	public void run() {
		ImportFile importFile = new ImportFile(crewList);
		crewList = importFile.run();
		
		rankList = DataMiner.mineRank(crewList);
		DataMiner.tallyRank(crewList, rankList);
		DataMiner.createReport(rankList);
		
		//System.out.println(" rt");
	}

}