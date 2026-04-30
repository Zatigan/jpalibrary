package co.simplon.jpalibrary.controller;

import co.simplon.jpalibrary.repository.BookRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import co.simplon.jpalibrary.entity.BookEntity;
import co.simplon.jpalibrary.service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
// @RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;
    @Autowired
    private BookService bookService;

    BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public List<BookEntity> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public BookEntity getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/books")
    public ResponseEntity<BookEntity> addBook(@RequestBody BookEntity book) {
        BookEntity bookToCreate = this.bookService.addBook(book);
        return new ResponseEntity<>(bookToCreate, HttpStatus.CREATED);
    }

    @PutMapping("/books/{id}")
    public Optional<BookEntity> updateBook(@PathVariable Long id, @RequestBody BookEntity book) {
        
        Optional<BookEntity> bookToUpdate = bookService.findById(id);
        
        if(bookToUpdate.isPresent()) {
            // BookEntity bookToUpdate = book.get();
        
        }
    }


    @DeleteMapping("/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteBook(@PathVariable Long id) {
        if (bookRepository.existsById(id)) {
            bookService.deleteBook(id);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Suppression impossible");
        }
    }
}
