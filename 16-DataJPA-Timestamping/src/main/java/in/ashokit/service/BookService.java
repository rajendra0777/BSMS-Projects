package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	
	// save 
	public String saveBook() {
		

		Book b5 = new Book("English",200.0);
		Book b1 = new Book("Marathi", 179.0);
		Book b2 = new Book("Hindi", 240.0);
		Book b3 = new Book("Sanskrit", 270.0);
		Book b4 = new Book("Biology", 245.0);

		List<Book> books = Arrays.asList(b1, b2, b3, b4,b5);

		if (!books.isEmpty()) {

			List<Book> saveAll = bookRepo.saveAll(books);
			return "Record Saved..";
		} else {
			return "Failed to save record";
		}

	}
	
	
	

}
