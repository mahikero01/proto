package home.rico.crewanalyzer;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DataMinerTest {

	@Test
	public void testMineRank() {
		DataMiner dm = new DataMiner();
		
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
		ArrayList<String> crRank;
		
		crRank = dm.mineRank(crList);
	}
}