package co.simplon.jpalibrary.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.simplon.jpalibrary.entity.BookEntity;
import co.simplon.jpalibrary.service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class BookController {

 @Autowired
 private BookService bookService;

 @GetMapping("/books")
 public Iterable<BookEntity> getBooks() {
     return bookService.getBooks();
 }

 @GetMapping("/books/{id}")
 public Optional<BookEntity> getOneBook(@RequestParam Long id) {
     return bookService.getOneBook(id);
 }
 
@PostMapping("/books")
public BookEntity addBook(@RequestBody BookEntity book) {
    //TODO: process POST request    
    return bookService.addBook(book);
}

@PutMapping("/books/{id}")
public BookEntity updateBook(@PathVariable Long id, @RequestBody BookEntity book) {
    //TODO: process PUT request
    return bookService.updateBook(book);
}

 @DeleteMapping("/books/{id}")
 public void deleteBook(@RequestParam Long id) {
  bookService.deleteBook(id);
 }
}
