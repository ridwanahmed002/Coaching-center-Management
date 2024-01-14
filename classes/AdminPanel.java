package classes;

import java.util.Date;

import java.text.SimpleDateFormat;
import abstracts.Coaching;
import abstracts.User;
import interfaces.BranchOperation;
import interfaces.BookSitOperation;
import interfaces.StudentOperation;
import interfaces.CoachingOperation;

public class AdminPanel implements StudentOperation, BranchOperation, CoachingOperation,BookSitOperation {
	public static SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
	User students[] = new User[100];
	Branch branchs[] = new Branch[100];
	Coaching coachings[] = new Coaching[100];
	SitBook[] sitBooks = new SitBook[100];

	@Override
	public void insertCoaching(Coaching coaching) {
		int flag = 0;
		for (int i = 0; i < coachings.length; i++) {
			if (coachings[i] == null) {
				coachings[i] = coaching;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("coaching Inserted");
		} else {
			System.out.println("Can Not Insert");
		}

	}

	@Override
	public void removeCoaching(Coaching coaching) {
		int flag = 0;
		for (int i = 0; i < coachings.length; i++) {
			if (coachings[i] == coaching) {
				coachings[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("coaching Removed");
		} else {
			System.out.println("Can Not Remove");
		}

	}

	@Override
	public Coaching getCoaching(int id) {
		Coaching coaching = null;

		for (int i = 0; i < coachings.length; i++) {
			if (coachings[i] != null) {
				if (coachings[i].getNo() == id) {
					coaching = coachings[i];
					break;
				}
			}
		}
		if (coaching != null) {
			System.out.println("Coaching Found");
		} else {
			System.out.println("Coaching Not Found");
		}
		return coaching;
	}

	@Override
	public void showAllCoachings() {
		for (Coaching c : coachings) {
			if (c != null) {
				System.out.println("**********************************");
				System.out.println("Coaching No: " + c.getNo());
				System.out.println("Coaching Start: " + c.getstart());
				System.out.println("Coaching Address: " + c.getaddress());
				System.out.println("Coaching Range: " + c.getRange());
				System.out.println("Coaching Branch Name: " + c.getBranch().getaddress());
				System.out.println("Coaching Branch sits booked: " + c.getBranch().getNumberOfSeatbooked());
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}

	}
	
	
	public void searchCoachingsByRange(String range ) {
		
//		if(countCoachingByRange(range) == 0) {
//			Tools.clearPrintHold("No Coachings found\n");
//			return;
//		}
		
		for (int i = 0; i < coachings.length; i++) {
			if (coachings[i] != null) {
				if (coachings[i].getRange().equals(range)) {
					System.out.println("**********************************");
					System.out.println("Coaching No: " + coachings[i].getNo());
					System.out.println("Coaching Start: " + coachings[i].getstart());
					System.out.println("Coaching Address: " + coachings[i].getaddress());
					System.out.println("Coaching Range: " + coachings[i].getRange());
					System.out.println("Coaching Branch Name: " + coachings[i].getBranch().getaddress());
					System.out.println("Coaching Fligth Branch seated booked: " + coachings[i].getBranch().getNumberOfSeatbooked());
					System.out.println("----------------------------------");
					System.out.println("----------------------------------");
				}
			}
		}

	}

	@Override
	public void insertBranch(Branch branch) {
		int flag = 0;
		for (int i = 0; i < branchs.length; i++) {
			if (branchs[i] == null) {
				branchs[i] = branch;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("branch Inserted");
		} else {
			System.out.println("Can Not Insert");
		}

	}

	@Override
	public void removeBranch(Branch branch) {
		int flag = 0;
		for (int i = 0; i < branchs.length; i++) {
			if (branchs[i] == branch) {
				branchs[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("branch Removed");
		} else {
			System.out.println("Can Not Remove");
		}

	}

	@Override
	public Branch getBranch(int id) {
		Branch branch = null;

		for (int i = 0; i < branchs.length; i++) {
			if (branchs[i] != null) {
				if (branchs[i].getId() == id) {
					branch = branchs[i];
					break;
				}
			}
		}
		if (branch != null) {
			System.out.println("Branch Found");
		} else {
			System.out.println("Branch Not Found");
		}
		return branch;
	}

	@Override
	public void showAllBranchs() {
		for (Branch c : branchs) {
			if (c != null) {
				System.out.println("**********************************");
				System.out.println("Branch address: " + c.getaddress());
				System.out.println("Branch ID: " + c.getId());
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}

	}

	public void insertStudent(Student c) {
		int flag = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = c;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Student Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}

	public void removeStudent(User user) {
		int flag = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == user) {
				students[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Student Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}
	@Override
	public void showAllStudent() {
		for (User c : students) {
			if (c != null) {
				System.out.println("**********************************");
				System.out.println("Student ID: " + c.getId());
				System.out.println("Student Name: " + c.getName());
				System.out.println("Student Email: " + c.getEmail());
				System.out.println("Student Mobile: " + c.getMobile());
				System.out.println("Student Gender: " + c.getGender());
				System.out.println("Student Dob: " + sdformat.format(c.getDob()));
				System.out.println("Student Address: " + c.getAddress());
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}
		
	}
	

	public User getStudent(int id) {
		User c = null;

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == id) {
					c = students[i];
					break;
				}
			}
		}
		if (c == null) {
			System.out.println("Student Not Found");
		}//  else {
		// 	System.out.println("Student  Found");
		// }
		return c;
	}

	public User loginUser(String email, String password) {
			
		User c = null;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getEmail().equals(email) && students[i].getPassword().equals(password)) {
					c = students[i];
					break;
				}
			}
		}
		if (c != null) {
			LoginSession.setLoginStatus(true);
			LoginSession.setUserID(c.getId());
			if(c.getRole().equals("admin")) {
				LoginSession.setRole(1);
			}else if(c.getRole().equals("user")) {
				LoginSession.setRole(2);
			}
			
			System.out.println("Login successful");
		} else {
			System.out.println("login email or password are wrong");
		}
		return c;
	}

	public void insertAdminData(User admin) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = admin;
				break;
			}
		}

		
	}

	@Override
	public void bookingSit(SitBook c) {
		int flag = 0;
		for (int i = 0; i < sitBooks.length; i++) {
			if (sitBooks[i] == null) {
				sitBooks[i] = c;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("bookingSit successfull");
		} else {
			System.out.println("bookingSit Not successfull");
		}
		
	}

	@Override
	public SitBook searchBookSitBYId(int id) {
		SitBook c = null;

		for (int i = 0; i < sitBooks.length; i++) {
			if (sitBooks[i] != null) {
				if (sitBooks[i].getId() == id) {
					c = sitBooks[i];
					break;
				}
			}
		}
		if (c != null) {
			System.out.println("Booking sit Found");
		} else {
			System.out.println("Booking sit Not Found");
		}
		return c;
		
	}

	@Override
	public void removeBookingSit(SitBook bookedSit) {
		int flag = 0;
		for (int i = 0; i < sitBooks.length; i++) {
			if (sitBooks[i] == bookedSit) {
				sitBooks[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("booking sit Removed");
		} else {
			System.out.println("booking sit Not Remove");
		}
	}

	
	public int countCoachingByRange(String range) {
		int count = 0;
		for(int i = 0; i < coachings.length; i++) {
			if(coachings[i] != null && coachings[i].getRange().equals(range)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public void showAllBookingSit() {
		for(int i = 0; i < sitBooks.length; i++) {
			if (sitBooks[i] != null) {
				
				System.out.println("**********************************");
				System.out.println("Sit ID : " + sitBooks[i].getId());
				System.out.println("Student : " + sitBooks[i].getStudent());
				System.out.println("Fees : " + sitBooks[i].getfees());
				System.out.println("Payment Status : " + sitBooks[i].getPaymentStatus());
				System.out.println("Coaching Range : " + sdformat.format(sitBooks[i].getBookedDate()));
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}
	}
	
	public void getBookingSitByUserId() {
		for(int i = 0; i < sitBooks.length; i++) {
			if(sitBooks[i]!= null ) {
				if(sitBooks[i].getStudent().getId() == LoginSession.getUserID()) {
					System.out.println("**********************************");
					System.out.println("Sit ID : " + sitBooks[i].getId());
					System.out.println("Student : " + sitBooks[i].getStudent());
					System.out.println("Fees : " + sitBooks[i].getfees());
					System.out.println("Payment Status : " + sitBooks[i].getPaymentStatus());
					System.out.println("Coaching Coaching Range : " + sdformat.format(sitBooks[i].getBookedDate()));
					System.out.println("----------------------------------");
					System.out.println("----------------------------------");
				}
			}
		}
	}

	@Override
	public void insertStudentr(Student student) {
		// TODO Auto-generated method stub
		
	}

	



}
