package bookstore.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore.bookstore.domain.Book;
import bookstore.bookstore.domain.BookRepository;
import bookstore.bookstore.domain.Category;
import bookstore.bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookstore(BookRepository bookRepo, CategoryRepository catRepo) {
		return (args) -> {
			Category scifi = new Category("scifi");
			Category novel = new Category("novel");
			Category horror = new Category("horror");
			catRepo.save(scifi);
			catRepo.save(novel);
			catRepo.save(horror);
			bookRepo.save(new Book("Ursula K. Le Guin", "The Compass Rose", 1982, "", 0.0, scifi));
			bookRepo.save(new Book("Eeva Turunen", "Sivistynyt ja miellyttävä ihminen", 2022, "", 0.0, novel));
			bookRepo.save(new Book("Monika Fagerholm", "Amerikkalainen tyttö", 2004, "", 0.0, novel));

			log.info("fetch all books");
			for (Book book : bookRepo.findAll()) {
				log.info(book.toString());
			}

			log.info("fetch all categories");
			for (Category cat : catRepo.findAll()) {
				log.info(cat.toString());
			}

		};
	}

}
