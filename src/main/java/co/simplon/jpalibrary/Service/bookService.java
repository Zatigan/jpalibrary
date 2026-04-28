package co.simplon.jpalibrary.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.jpalibrary.entity.BookEntity;
import co.simplon.jpalibrary.repository.BookRepository;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public Iterable<BookEntity> getBooks() {
   return bookRepository.findAll();
  }

  public Optional<BookEntity> getOneBook(final Long id) {
   return bookRepository.findById(id);
  }

  public BookEntity addBook(BookEntity book) {
   return bookRepository.save(book);
  }

  public BookEntity updateBook(BookEntity book) {
   return bookRepository.save(book);
  }

  public void deleteBook(final Long id) {
   bookRepository.deleteById(id);
  }
}
