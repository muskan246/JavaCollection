package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner; 
public class BookList {

	public static void main(String[] args) {
		boolean  bool = true;
		// TODO Auto-generated method stub
		ArrayList<Book> booklist=new ArrayList<Book>();
		booklist.add(new Book(1,"Physics","HC Verma","xyz", 12));
		booklist.add(new Book(5,"Chemistry","Pankaj Kala","abc", 20));
		booklist.add(new Book(2,"Maths","RS Agarwal","tyu", 32));
		booklist.add(new Book(4,"English","R.S Singh","qwe", 10));
		booklist.add(new Book(3,"Hindi","Neeta Singh","mno", 45));
//		System.out.println(booklist);
		
		
		Iterator itr = booklist.iterator();
		while(itr.hasNext())
		{
			Object obj =itr.next();
			Book b = (Book)obj;
			System.out.println(b);
		}
		Scanner sc = new Scanner(System.in); 
		
		while(bool)
		{
		System.out.println("\n Provide the choice required: ");
		System.out.println("\n 1. Sort on the basis of ID ");
		System.out.println("\n 2. Sort on the basis of Name ");
		System.out.println("\n 3. Sort on the basis of Qunatity ");
		System.out.println("\n 4. To Exit");
		
		 int ch= sc.nextInt();
		 Book b1 = null;
		
		switch (ch) {
		case 1:
			System.out.println("\nSorted By Book ID \n");
			BookSortByID id=new BookSortByID();
			booklist.sort(id);
			System.out.println(booklist);
			break;
		case 2:
			System.out.println("\nSorted By Book Name \n");
			BookSortByName name=new BookSortByName();
			booklist.sort(name);
			System.out.println(booklist);
			break;
		case 3:
			System.out.println("\nSorted By Book Quantity \n");
			BookSortByQuantity quantity=new BookSortByQuantity();
			booklist.sort(quantity);
			System.out.println(booklist);
			break;
		case 4:
			bool = false;
			System.exit(0);
			return;
			 
		default:
			System.out.println("Please Provide valid input");
		}
		
//		System.out.println("\nSorted By Book ID \n");
//		BookSortByID id=new BookSortByID();
//		booklist.sort(id);
//		System.out.println(booklist);
//		
//		System.out.println("\nSorted By Book Name \n");
//		BookSortByName name=new BookSortByName();
//		booklist.sort(name);
//		System.out.println(booklist);
//		
//		System.out.println("\nSorted By Book Quantity \n");
//		BookSortByQuantity quantity=new BookSortByQuantity();
//		booklist.sort(quantity);
//		System.out.println(booklist);
//		
	}

}

	
}
