package home.rico.crewanalyzer;

import java.util.ArrayList;

//class for mining data from records extracted from "fil.txt"
public class DataMiner {
	public static ArrayList<String> mineRank(ArrayList<CrewInfo> crewListRef) {
		ArrayList<String> crewRankTemp = new ArrayList<String>();
		String rank;
		int flag;
		
		CrewInfo crewTemp;
		crewTemp = crewListRef.get(0);
		rank = crewTemp.getRank();
		crewRankTemp.add(rank);
		crewTemp = null;
		
		for (CrewInfo crew : crewListRef) {
			rank = crew.getRank();
			flag = 0;
			for (String currentRank : crewRankTemp) {
				if (rank == currentRank) {
					++flag;
				}
				
				if (flag == 0) {
					crewRankTemp.add(rank);
					break;
				}
			}
		}
		
		return crewRankTemp;
	}
}