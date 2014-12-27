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
		System.out.printf("%tc\n", st1.getRecordDate());
			
		//saveRecordFirst(st1);
		
		Calendar datetime2 = Calendar.getInstance();
		st2.setRecordDate(datetime2);
		System.out.printf("%tc\n", st2.getRecordDate());
		
		//saveMyLibraryToSerialFile(st2);
		
		//getMyLibraryFromSerialFile();
		
		//System.out.printf("%tc\n", out.getRecordDate());
		//System.out.printf("%tc\n", out.getRecordDate());
		
	}
	/*
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

	public static void saveRecordFirst (CrewStatRecord crewStatRecordRef) {
		
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream( 
						new BufferedOutputStream( 
								new FileOutputStream("testing.sr") 
						) 
			);
			try {
				objectOut.writeObject(crewStatRecordRef);
			} finally {
				objectOut.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static CrewStatRecord getMyLibraryFromSerialFile() {
		
		CrewStatRecord crewStatRecordLocal = null;
		
		try {
			ObjectInputStream objectIn = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream("testing.sr")
						)
			);
			try {
				crewStatRecordLocal = (CrewStatRecord) objectIn.readObject();
				
				System.out.printf("%tc\n",crewStatRecordLocal.getRecordDate());
			}
			finally {
				objectIn.close();
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
			
		return crewStatRecordLocal;
	}
*/
}
	
	


