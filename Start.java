
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import abstracts.Coaching;
import abstracts.User;
import classes.AboutUs;
import classes.Admin;
import classes.AdminPanel;
import classes.Branch;
import classes.SitBook;
import classes.Student;
import classes.Outside;
import classes.LoginSession;
import classes.Inside;

public class Start {
	public static SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		System.out.println("Welcome to UDVASH");
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		AdminPanel adminpanel = new AdminPanel();
		Admin admin = new Admin(1, "admin", "admin@admin.com", "password", "085655877", "male",
				sdformat.parse("21/03/2002"), "dhaka");
		adminpanel.insertAdminData(admin);

		while (choice) {
			System.out.println("Here are Some Options for You: \n");
			System.out.println("	1. Show coachings");
			if (LoginSession.isLoginStatus() != true) {
				System.out.println("	2. Login/ Sign Up");
			}

			if (LoginSession.isLoginStatus() == true && LoginSession.getRole() ==1) {
				System.out.println("	3. Admin control");
			}
			if(LoginSession.isLoginStatus() == true) {
				System.out.println("	4. Booking sit");
			}else {
				System.out.print(" ");
			}
			
			System.out.println("	5. About us");
			if (LoginSession.isLoginStatus() == true) {
				System.out.println("	6. logout");
			}
			System.out.println("	7. Exit the Application\\n");
			System.out.print("What do you want to do? : ");

			int first = sc.nextInt();

			switch (first) {
			case 1:

				System.out.println("You have selected  Show coachings");
				System.out.println("Here are Some Options for You: \n");
				System.out.println("	1. Show inside dhaka branches");
				System.out.println("	2. Show outside dhaka branches");
				System.out.println("	3. Go Back\n");
				System.out.print("What do you want to do? : ");
				int second1 = sc.nextInt();

				switch (second1) {
				case 1:
					System.out.println("Show all the inside dhaka branches");
					adminpanel.searchCoachingsByRange("inside");

					break;

				case 2:

					System.out.println("Show all the outside dhaka branches");
					adminpanel.searchCoachingsByRange("outside");

					break;

				case 3:

					System.out.println("You have Selected to Go Back");
					break;

				default:

					System.out.println("Invalid Input");
					break;
				}

				break;

			case 2:
				if (LoginSession.isLoginStatus() == true){
					System.out.println("You have already login ,Access deny");
					break;
				}
				System.out.println("You have selected login/Sign Up");

				System.out.println("Here are Some Options for You: \n");
				System.out.println("	1. Login");
				System.out.println("	2. Sign Up");
				System.out.println("	3. Go Back\\n");
				System.out.print("What do you want to do? : ");
				int second2 = sc.nextInt();

				switch (second2) {
				case 1:

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. login As Student");
					System.out.println("	2. login As Admin");
					System.out.println("	3. Go Back\n");

					System.out.print("What do you want to do? : ");
					int optionForl = sc.nextInt();

					switch (optionForl) {
					case 1:
						System.out.print("Enter you  email: ");
						String email = sc.next();
						System.out.print("Enter you password: ");
						String password = sc.next();

						adminpanel.loginUser(email, password);

						break;

					case 2:

						System.out.print("Enter you  email: ");
						String email1 = sc.next();
						System.out.print("Enter you password: ");
						String password2 = sc.next();

						 adminpanel.loginUser(email1, password2);

						break;

					case 3:

						System.out.println("Going Back . . .");
						break;

					default:

						System.out.println("Invalid Input");
						break;
					}

					break;

				case 2:
					System.out.println("You have selected create Account/Sign Up");

					System.out.print("Enter you id: ");
					int id = sc.nextInt();


					System.out.print("Enter you email: ");
					String email = sc.next();

					System.out.print("Enter you passsword: ");
					String password = sc.next();

					System.out.print("Enter you mobiile: ");
					String mobile = sc.next();

					System.out.print("Enter you gender: ");
					String gender = sc.next();

					System.out.print("Enter you DateOfBirth(dd/mm/yyy): ");
					String dob = sc.next();

					System.out.print("Enter you address: ");
					String address = sc.next();

					Student cus1 = new Student();

					if (adminpanel.getStudent(id) == null) {
						cus1.setId(id);
						cus1.setName(address);
						cus1.setEmail(email);
						cus1.setPassword(password);
						cus1.setMobile(mobile);
						cus1.setGender(gender);
						cus1.setAddress(address);
						cus1.setDob(sdformat.parse(dob));
						adminpanel.insertStudent(cus1);
					} else {
						System.out.println("id is taken");
					}

					break;

				case 3:

					System.out.println("Going Back . . .");
					break;

				default:

					System.out.println("Invalid Input");
					break;
				}

				break;

			case 3:
				if(LoginSession.isLoginStatus() == false){
					System.out.println("Access deny");
					break;
				}
				System.out.println("Admin Controll");
				System.out.println("	1. Student mangement ");
				System.out.println("	2. Coaching mangement");
				System.out.println("	3. Branch mangement");
				System.out.println("	4. Go Back\n");
				System.out.print("What do you want to do? : ");
				int third1 = sc.nextInt();

				switch (third1) {
				case 1:

					System.out.println("You have selected customer Management");

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Add New Student");
					System.out.println("	2. Remove Existing Student");
					System.out.println("	3. Search Student by id");
					System.out.println("	4. See all Student");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second3 = sc.nextInt();

					switch (second3) {
					case 1:

						System.out.print("Enter you id: ");
						int id = sc.nextInt();

						System.out.print("Enter you email: ");
						String email = sc.next();

						System.out.print("Enter you passsword: ");
						String password = sc.next();

						System.out.print("Enter you mobiile: ");
						String mobile = sc.next();

						System.out.print("Enter you gender: ");
						String gender = sc.next();

						System.out.print("Enter you DateOfBirth(dd/mm/yyy): ");
						String dob = sc.next();

						System.out.print("Enter you address: ");
						String address1 = sc.next();

						Student cus1 = new Student();

						if (adminpanel.getStudent(id) == null) {
							cus1.setId(id);
							cus1.setName(address1);
							cus1.setEmail(email);
							cus1.setPassword(password);
							cus1.setMobile(mobile);
							cus1.setGender(gender);
							cus1.setDob(sdformat.parse(dob));
							cus1.setAddress(address1);
						} else {
							System.out.println("id is taken");
						}

						break;

					case 2:

						System.out.println("You have selected Remove Existing Student");

						System.out.print("Enter Student id: ");
						int nid2 = sc.nextInt();

						adminpanel.removeStudent(adminpanel.getStudent(nid2));

						break;
					case 3:
						System.out.print("Enter Student id for searching customer: ");
						int nid3 = sc.nextInt();
						User searchCus = adminpanel.getStudent(nid3);

						if(searchCus !=null){
							System.out.println("**********************************");
							System.out.println("Student ID: " + searchCus.getId());
							System.out.println("Student Name: " + searchCus.getName());
							System.out.println("Student Email: " + searchCus.getEmail());
							System.out.println("Student Mobile: " + searchCus.getMobile());
							System.out.println("Student Gender: " + searchCus.getGender());
							System.out.println("Student Dob: " + sdformat.format(searchCus.getDob()));
							System.out.println("Student Address: " + searchCus.getAddress());
							System.out.println("----------------------------------");
							System.out.println("----------------------------------");
						}else{

						}
						adminpanel.showAllStudent();
						break;

					case 4:
						adminpanel.showAllStudent();
						break;

					case 5:

						System.out.println("Going Back . . .");
						break;

					default:

						System.out.println("Invalid Input");
						break;
					}

					break;

				case 2:
					System.out.println("You have selected Coaching Management");

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Coaching");
					System.out.println("	2. Remove Existing Coaching");
					System.out.println("	3. Search Coaching");
					System.out.println("	4. See all Coaching");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second4 = sc.nextInt();

					switch (second4) {
					case 1:

						System.out.print("Enter Coaching No: ");
						int no = sc.nextInt();
						sc.nextLine();
						

						System.out.print("Enter Coaching start: ");
						String start = sc.nextLine();

						System.out.print("Enter Coaching address: ");
						String to = sc.nextLine();

						System.out.print("Enter Coaching branch id: ");
						int branch = sc.nextInt();

						System.out.print("Enter Coaching coachingRange(1. inside ,2. outside): ");
						int coachingRange = sc.nextInt();


						Coaching coaching5 = null;
						if (coachingRange == 2) {
							coaching5 = new Outside();
						} else if (coachingRange == 1) {
							coaching5 = new Inside();
						}
						Branch bran = adminpanel.getBranch(branch);

						if (adminpanel.getCoaching(no) == null && bran != null) {

							coaching5.setNo(no);
							coaching5.setstart(start);
							coaching5.setaddress(to);
							coaching5.setBranch(bran);
							adminpanel.insertCoaching(coaching5);
							
						} else {
							System.out.println("change you coaching , your no is taken");
						}

						break;

					case 2:

						System.out.println("You have selected Remove Existing Coaching");

						System.out.print("Enter Coaching id: ");
						int Coaching1ID = sc.nextInt();

						adminpanel.removeCoaching(adminpanel.getCoaching(Coaching1ID));

						break;

					case 3:
						System.out.print("Enter Coaching id: ");
						int Coaching1IDs = sc.nextInt();
						Coaching singleCoachingD = adminpanel.getCoaching(Coaching1IDs);

						if(singleCoachingD != null){
							System.out.println("Coaching No: " + singleCoachingD.getNo());
							System.out.println("Coaching start: " + singleCoachingD.getstart());
							System.out.println("Coaching Address: " + singleCoachingD.getaddress());
							System.out.println("Coaching Coaching Range: " + singleCoachingD.getRange());
							System.out.println("Coaching Coaching Branch Name: " + singleCoachingD.getBranch().getaddress());
							System.out.println("Coaching Coaching Branch seated booked: " + singleCoachingD.getBranch().getNumberOfSeatbooked());
						}else{

						}
						break;
					case 4:
						adminpanel.showAllCoachings();
						break;

					case 5:

						System.out.println("Going Back . . .");
						break;

					default:

						System.out.println("Invalid Input");
						break;
					}

					break;

				case 3:

					System.out.println("You have selected Branch Management");

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Branch");
					System.out.println("	2. Remove Existing Branch");
					System.out.println("	3. Search Branch");
					System.out.println("	4. See all Branch");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second6 = sc.nextInt();

					switch (second6) {
					case 1:

						System.out.print("Enter Branch id: ");
						int id = sc.nextInt();

						System.out.print("Enter Branch address: ");
						String address= sc.next();

						System.out.print("Enter Branch Number Of seat: ");
						int noOFseat = sc.nextInt();

						if (adminpanel.getBranch(id) == null) {
							Branch branch = new Branch();
							branch.setId(id);
							branch.setaddress(address);
							branch.setNumberOfSeat(noOFseat);

							adminpanel.insertBranch(branch);
						}

						break;

					case 2:

						System.out.println("You have selected Remove Existing Branch");

						System.out.print("Enter Branch id: ");
						int i3 = sc.nextInt();

						adminpanel.removeBranch(adminpanel.getBranch(i3));

						break;

					case 3:
						System.out.print("Enter Branch id: ");
						int i3s = sc.nextInt();

						Branch airDs = adminpanel.getBranch(i3s);

						if(airDs != null){
							System.out.println("**********************************");
							System.out.println("Branch Name: " + airDs.getaddress());
							System.out.println("Branch NID: " + airDs.getId());
							System.out.println("----------------------------------");
							System.out.println("----------------------------------");
						}

						break;
					case 4:
						adminpanel.showAllBranchs();
						break;

					case 5:

						System.out.println("Going Back . . .");
						break;

					default:

						System.out.println("Invalid Input");
						break;
					}

					break;
				case 4:
					System.out.println("Going Back . . .");
					break;
				default:

					System.out.println("Invalid Input");
					break;
				}
				break;

			case 4:
				if(LoginSession.isLoginStatus() == false){
					System.out.println("Access deny");
					break;
				}
				System.out.println("You have selected  Booking Ticket");
				System.out.println("Here are Some Options for You: \n");
				System.out.println("	1. Booking Ticket");
				System.out.println("	2. Remove Ticket");
				System.out.println("	3. Search Ticket");
				System.out.println("	4. Show All Ticket");
				System.out.println("	5. Go Back\n");
				System.out.print("What do you want to do? : ");
				int second9 = sc.nextInt();
				switch (second9) {
				case 1:

					System.out.print("Enter Booking sit id: ");
					int id = sc.nextInt();

					System.out.print("Enter Booking student id address: ");
					int cusID = sc.nextInt();

					System.out.print("Enter Booking Coaching id address: ");
					int flithID = sc.nextInt();

					System.out.print("Enter Booking sit fees: ");
					int fees = sc.nextInt();

					System.out.print("Enter Booking sit Date(dd/mm/yyyy): ");
					String date = sc.next();
					adminpanel.getCoaching(flithID);
					if (adminpanel.searchBookSitBYId(id) == null && adminpanel.getStudent(cusID) != null
							&& adminpanel.getCoaching(flithID) != null) {

						SitBook booktk = new SitBook();
						booktk.setId(id);
						booktk.setStudent(adminpanel.getStudent(cusID));
						booktk.setCoaching(adminpanel.getCoaching(flithID));
						booktk.setFees(fees);
						booktk.setBookedDate(sdformat.parse(date));
					}

					break;

				case 2:
					System.out.print("Enter Booking sit id: ");
					int id8 = sc.nextInt();

					adminpanel.removeBookingSit(adminpanel.searchBookSitBYId(id8));

					break;

				
					
				case 3 :
					System.out.print("Enter Booking sit id: ");
					int id8s = sc.nextInt();

					SitBook bookingTicketData = adminpanel.searchBookSitBYId(id8s);
					if (bookingTicketData !=null){
						System.out.println("**********************************");
						System.out.println("Ticket ID : " + bookingTicketData.getId());
						System.out.println("Student : " + bookingTicketData.getStudent());
						System.out.println("Ticket fees : " + bookingTicketData.getfees());
						System.out.println("Payment Status : " + bookingTicketData.getPaymentStatus());
						System.out.println("Coaching Coaching Range : " + sdformat.format(bookingTicketData.getBookedDate()));
						System.out.println("----------------------------------");
						System.out.println("----------------------------------");
					}else{

					}
					
					break;
				case 4 :
					
					adminpanel.showAllBookingSit();
					break;
				case 5:

					System.out.println("You have Selected to Go Back");
					break;
				default:

					System.out.println("Invalid Input");
					break;
				}
				break;

			case 5:

				System.out.println("you have selected about us");

				new AboutUs();
				break;

			case 6:
				if (LoginSession.isLoginStatus() == true) {
					LoginSession.setLoginStatus(false);
				}
				break;

			case 7:

				System.out.println("You have selected to exit the application");
				System.out.println("Thank you for using Application");
				choice = false;
				sc.close();
				break;

			default:

				System.out.println("Invalid Input");
				break;
			}
		}

	}

}

