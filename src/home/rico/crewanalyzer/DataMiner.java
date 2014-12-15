package home.rico.crewanalyzer;

import java.util.ArrayList;

//class for mining data from records extracted from "fil.txt"
public class DataMiner {
	
	//method for extracting all possible rank
	public static ArrayList<RankInfo> mineRank(ArrayList<CrewInfo> crewListRef) {
		ArrayList<RankInfo> rankListLocal = new ArrayList<RankInfo>();
		String rank;
		int flag;
		
		CrewInfo crewInfoLocal = new CrewInfo();
		RankInfo rankInfoLocal = new RankInfo();
		crewInfoLocal = crewListRef.get(0);
		rank = crewInfoLocal.getRank();
		rankInfoLocal.setRank(rank);
		rankListLocal.add(rankInfoLocal);
		crewInfoLocal = null;
		rankInfoLocal = null;
		
		for (CrewInfo currentCrew : crewListRef) {
			rank = currentCrew.getRank();
			flag = 0;
			for (RankInfo currentRank : rankListLocal) {
				if ( rank.equalsIgnoreCase(currentRank.getRank()) ) {
					++flag;
				}
			}
			
			if (flag == 0) {
				RankInfo rankInfoTemp = new RankInfo();
				rankInfoTemp.setRank(rank);
				rankListLocal.add(rankInfoTemp);
				rankInfoTemp = null;
			}
		}
		
		return rankListLocal;
	}
	
	//method for tally of crew ranks/positions
	public static void tallyRank(ArrayList<CrewInfo> crewListRef, ArrayList<RankInfo> rankListRef ) {
		
		String rank;
		
		for (CrewInfo currentCrew : crewListRef) {
			rank = currentCrew.getRank();
			for (RankInfo currentRank : rankListRef) {
				if ( rank.equalsIgnoreCase(currentRank.getRank()) ) {
					int count = currentRank.getCount();
					currentRank.setCount(++count);
					break;
				}
			}
		}
	}
}