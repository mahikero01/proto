package home.rico.crewanalyzer;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ImportFileTest {

	@Test
	public void test() {
		ImportFile.openFile();
		
		ArrayList<CrewInfo> crewList =  new ArrayList<CrewInfo>();
		
		ImportFile.readRecords(crewList);
		ImportFile.closedFile();
	}

}
