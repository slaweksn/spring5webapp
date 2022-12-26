package guru.springframework.spring5webapp.conytollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

	private final AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	@GetMapping(path = "/authors")
	public String getBooks(Model nodel) {
		
		nodel.addAttribute("authors", authorRepository.findAll());
		
		return "authors/list";
	}
}
