package classes;

import java.util.Date;

import abstracts.User;

public class Student extends User {
	protected String role = "user";

	public Student(int id, String name, String email, String password, String mobile, String gender, Date dob,
			String address) {
		super(id, name, email, password, mobile, gender, dob, address);
	}

	public Student() {
	}
	public String getRole() {
		return role;
	}
}

