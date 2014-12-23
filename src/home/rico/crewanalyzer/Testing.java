package home.rico.crewanalyzer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrewStatRecord st1 = new CrewStatRecord();
		CrewStatRecord st2 = new CrewStatRecord();
		CrewStatRecord out = new CrewStatRecord();
		
		Calendar datetime = Calendar.getInstance();
		st1.setRecordDate(datetime);
			
		saveMyLibraryToSerialFile(st1);
		
		Calendar datetime2 = Calendar.getInstance();
		st2.setRecordDate(datetime2);
		
		saveMyLibraryToSerialFile(st2);
		
		out = getMyLibraryFromSerialFile();
		
		System.out.printf("%tc\n", out.getRecordDate());
		System.out.printf("%tc\n", out.getRecordDate());
		
	}
	public static boolean saveMyLibraryToSerialFile(CrewStatRecord st) {
			boolean saved = false;
			try {
			ObjectOutputStream oos =
					new ObjectOutputStream(
							new BufferedOutputStream(
									new FileOutputStream("test.ser",true)));
			// inner try block
			try {
			oos.writeObject(st);
			saved = true;
			}
			finally {
			oos.close();
			}
			}
			catch (Exception ex) {
			ex.printStackTrace();
			}
			return saved;
			}

	public static CrewStatRecord getMyLibraryFromSerialFile() {
		CrewStatRecord ml = null;
		try {
		ObjectInputStream ois =
		new ObjectInputStream(
		new BufferedInputStream(
		new FileInputStream("test.ser")));
		try {
			ml = (CrewStatRecord) ois.readObject();
			
			System.out.printf("%tc\n", ml.getRecordDate());
			
			ml = (CrewStatRecord) ois.readObject();
			System.out.printf("%tc\n", ml.getRecordDate());
			
			
			
			}
			finally {
			ois.close();
			}
			}
			catch (Exception ex) {
			ex.printStackTrace();
			}
			return ml;
			}
		}
	
	


