package interfaces;

import abstracts.User;
import classes.Student;

public interface StudentOperation {
	public void insertStudentr(Student student);

	public void removeStudent(User student);

	public User getStudent(int id);

	public void showAllStudent();
}
