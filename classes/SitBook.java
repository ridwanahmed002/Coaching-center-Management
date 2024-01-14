package classes;

import java.util.Date;

import abstracts.Coaching;
import abstracts.User;

public class SitBook {
	private int id;
	private Student student;
	private Coaching coaching;
	private double fees;
	private Date bookedDate;
	private boolean paymentStatus;

	
	
	public SitBook() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(User user) {
		this.student = (Student) user;
	}

	public Coaching getCoaching() {
		return coaching;
	}

	public void setCoaching(Coaching coaching) {
		this.coaching = coaching;
	}

	public double getfees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public boolean getPaymentStatus() {
		return paymentStatus;
	}

}
