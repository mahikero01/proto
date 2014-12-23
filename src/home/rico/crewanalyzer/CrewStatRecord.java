package home.rico.crewanalyzer;

import java.util.ArrayList;
import java.util.Calendar;

//class for monthly crew stat record
public class CrewStatRecord {
	
	private Calendar recordDate;
	private ArrayList<CrewInfo> crewList;

	public Calendar getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Calendar recordDate) {
		this.recordDate = recordDate;
	}
	
	public ArrayList<CrewInfo> getCrewList() {
		return crewList;
	}

	public void setCrewList(ArrayList<CrewInfo> crewList) {
		this.crewList = crewList;
	}
}
