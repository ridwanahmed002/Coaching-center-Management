package interfaces;

import classes.SitBook;

public interface BookSitOperation {
	public void bookingSit(SitBook c);
	public SitBook searchBookSitBYId(int id);
	public void removeBookingSit(SitBook bookedTicket);
	public void showAllBookingSit();
}

