package bookstore.bookstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bookstore.bookstore.domain.Book;
import bookstore.bookstore.domain.BookRepository;

@Controller
public class BookController {
    @Autowired
	BookRepository bookRepository; 

    @GetMapping({ "/index" })
    public String getIndex() {
        return "index";
    }

    @GetMapping({ "/booklist"})
    public String getBooklist(Model model) {
        List<Book> books =  (List<Book>) bookRepository.findAll(); // haetaan tietokannasta autot
        model.addAttribute("books", books); // välitetään autolista templatelle model-olion avulla
        return "booklist";
    }
}
