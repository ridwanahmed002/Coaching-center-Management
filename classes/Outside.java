package classes;

import abstracts.Coaching;

public class Outside extends Coaching {
	private String Range = "Outside";
	
	public Outside() {
		super();
	}

	public Outside(int no, String start, String address, int sit) {
		super(no, start, address, sit);
		
	}

	public String getRange(){
		return this.Range;
	}

}
