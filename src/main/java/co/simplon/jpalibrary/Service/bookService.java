package co.simplon.jpalibrary.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.jpalibrary.Repository.BookRepository;
import co.simplon.jpalibrary.entity.Book;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public Iterable<Book> getBooks() {
   return bookRepository.findAll();
  }

  public Optional<Book> getOneBook(final Long id) {
   return bookRepository.findById(id);
  }

  public Book addBook(Book book) {
   return bookRepository.save(book);
  }

  public Book updateBook(Book book) {
   return bookRepository.save(book);
  }

  public void deleteBook(final Long id) {
   bookRepository.deleteById(id);
  }
}
