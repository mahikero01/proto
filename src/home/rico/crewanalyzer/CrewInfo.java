package home.rico.crewanalyzer;

public class CrewInfo {
	private short pin;
	private String name;
	private String rank;
	private String datePromoted;
	private String dateOfBirth;
	private String startEmployment;
	
	public short getPin() {
		return pin;
	}
	public void setPin(short pin) {
		this.pin = pin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDatePromoted() {
		return datePromoted;
	}
	public void setDatePromoted(String datePromoted) {
		this.datePromoted = datePromoted;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getStartEmployment() {
		return startEmployment;
	}
	public void setStartEmployment(String startEmployment) {
		this.startEmployment = startEmployment;
	}
	
}
