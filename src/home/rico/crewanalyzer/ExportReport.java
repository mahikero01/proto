package home.rico.crewanalyzer;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

//class for exporting report on file "report.txt"
public class ExportReport {
	
	private static Formatter output;
	
	public static void run(ArrayList<RankInfo> rankListRef) {
		openFile();
		addRecords(rankListRef);
		closeFile();
	}

	private static void openFile() {
		try {
			output = new Formatter("report.txt");
		} catch (SecurityException securityException) {
			System.err.println("Write permission denied");
			System.exit(1);
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error opening file");
			System.exit(1);
		}
	}
	
	private static void addRecords(ArrayList<RankInfo> rankListRef) {
		int total = 0;
		
		for (RankInfo currentRank : rankListRef) {
			try {
				output.format("%s: %d%n", currentRank.getRank(), currentRank.getCount());
				total += currentRank.getCount();
			} catch (Exception e){
				System.err.println("error");
			}
		}
		
		try {
			output.format("%nTotal Crew: %d", total);
		} catch (Exception e){
			System.err.println("error");
		}
	}
	
	private static void closeFile() {
		if (output != null) {
			output.close();
		}
	}
}
