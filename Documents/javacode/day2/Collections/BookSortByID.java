package Collection;

import java.util.Comparator;

public class BookSortByID implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		int r=(b1.getId() - b2.getId());
		return r;
	}

}
