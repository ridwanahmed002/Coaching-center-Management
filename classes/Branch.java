package classes;

public class Branch {
	private int id;
	private String address;
	private int numberOfSeat;
	private int numberOfSeatbooked;
	public Branch() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public int getNumberOfSeatbooked() {
		return numberOfSeatbooked;
	}

	public void setNumberOfSeatbooked(int numberOfSeatbooked) {
		this.numberOfSeatbooked = numberOfSeatbooked;
	}

}

