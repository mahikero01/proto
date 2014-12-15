package home.rico.crewanalyzer;

import java.util.ArrayList;

import org.junit.Test;

public class DataMinerTest {

	@Test
	public void testMineRank() {		
		CrewInfo cr1 = new CrewInfo();
		cr1.setRank("master");
		CrewInfo cr2 = new CrewInfo();
		cr2.setRank("master");
		CrewInfo cr3 = new CrewInfo();
		cr3.setRank("chief");
		CrewInfo cr4 = new CrewInfo();
		cr4.setRank("mess");
		ArrayList<CrewInfo> crList = new ArrayList<CrewInfo>();
		crList.add(cr1);
		crList.add(cr2);
		crList.add(cr3);
		crList.add(cr4);
	}
	
	@Test
	public void testTallyRank() {
				
		CrewInfo cr1 = new CrewInfo();
		cr1.setRank("master");
		CrewInfo cr2 = new CrewInfo();
		cr2.setRank("master");
		CrewInfo cr3 = new CrewInfo();
		cr3.setRank("chief");
		CrewInfo cr4 = new CrewInfo();
		cr4.setRank("mess");
		ArrayList<CrewInfo> crList = new ArrayList<CrewInfo>();
		crList.add(cr1);
		crList.add(cr2);
		crList.add(cr3);
		crList.add(cr4);
		
		RankInfo rk1 = new RankInfo();
		rk1.setRank("master");
		RankInfo rk2 = new RankInfo();
		rk2.setRank("chief");
		RankInfo rk3 = new RankInfo();
		rk3.setRank("mess");
		ArrayList<RankInfo> rkList = new ArrayList<RankInfo>();
		rkList.add(rk1);
		rkList.add(rk2);
		rkList.add(rk3);
		
		DataMiner.tallyRank(crList, rkList);
	}
}