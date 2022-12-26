package guru.springframework.spring5webapp.conytollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {

	private final BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@GetMapping(path = "/books")
	public String getBooks(Model nodel) {
		
		nodel.addAttribute("books", bookRepository.findAll());
		
		return "books/list";
	}
}
