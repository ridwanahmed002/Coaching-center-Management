package interfaces;

import abstracts.Coaching ;

public interface CoachingOperation {
	public void insertCoaching(Coaching coaching);

	public void removeCoaching(Coaching coaching);

	public Coaching getCoaching(int id);

	public void showAllCoachings();
}
