package classes;

import abstracts.Coaching;

public class Inside extends Coaching {
	private String Range = "Inside";

	public Inside() {
		super();
	}

	public Inside(int no, String start, String address, int sit) {
		super(no, start, address, sit);
	}

	public String getRange() {
		return Range;
	}

}
