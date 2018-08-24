

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.interfaces.BookOperations;

public class BookOperationsImplementation implements BookOperations {
	
    List<Book> books= new ArrayList<Book>();
    BookIOImplementation br= new BookIOImplementation();
  
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		boolean found=books.add(book);
		if(found)
		{
			return 1;
		}
		else
		
		return 0;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		boolean removed=books.remove(book);
		if(removed)
		{
			return true;
		}
		else
		return false;
	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		List<Book> bookn=new ArrayList<>();
		
		Iterator<Book> it=books.iterator();
		while(it.hasNext())
		{
			
			Book data=it.next();
			String name=data.getName();
			if(book_name.equals(name)) {
			bookn.add(data);
		}
		
		
	}

		return bookn;

	}
}
