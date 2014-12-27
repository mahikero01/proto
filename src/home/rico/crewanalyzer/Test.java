package home.rico.crewanalyzer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		CrewStatRecord st1 = new CrewStatRecord();
		CrewStatRecord st2 = new CrewStatRecord();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
	}

}
