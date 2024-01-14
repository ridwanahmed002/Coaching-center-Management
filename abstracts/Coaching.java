package abstracts;


import classes.Branch;

public abstract class Coaching {
	private int no;
	private String start;
	private String address;
	private String Range;
	private Branch branch;
	
	public Coaching() {
	}

	public Coaching(int no, String start, String address,int sit) {
		super();
		this.no = no;
		this.start = start;
		this.address= address;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getstart() {
		return start;
	}

	public void setstart(String start) {
		this.start = start;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address= address;
	}


	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getRange() {
		return Range;
	}

}
