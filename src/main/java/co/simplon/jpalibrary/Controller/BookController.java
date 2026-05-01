package co.simplon.jpalibrary.Controller;

import co.simplon.jpalibrary.Repository.BookRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.simplon.jpalibrary.entity.BookEntity;
import co.simplon.jpalibrary.Service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;
    @Autowired
    private BookService bookService;

    BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("")
    public List<BookEntity> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public BookEntity getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("")
    public ResponseEntity<BookEntity> addBook(@RequestBody BookEntity book) {
        BookEntity bookToCreate = this.bookService.addBook(book);
        return new ResponseEntity<>(bookToCreate, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookEntity> updateBook(@PathVariable Long id, @RequestBody BookEntity book) {
        
        boolean doesBookExist = bookService.isBookExisting(id);
                
        if(doesBookExist) {
            BookEntity currentBook = bookService.getBookById(id);

            String newTitle = book.getTitle();
            if(newTitle != null) {
                currentBook.setTitle(newTitle);
            }

            String newDescription = book.getDescription();
            if(newDescription != null) {
                currentBook.setDescription(newDescription);
            }

            Boolean newAvailable = book.getAvailable();
            if(newAvailable != null) {
                currentBook.setAvailable(newAvailable);
            }

            bookService.updateBook(currentBook);
            
            return new ResponseEntity<>(currentBook, HttpStatus.ACCEPTED);

        } else {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Current ID does not match any book");
        }
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteBook(@PathVariable Long id) {
        if (bookRepository.existsById(id)) {
            bookService.deleteBook(id);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Suppression impossible");
        }
    }
}
