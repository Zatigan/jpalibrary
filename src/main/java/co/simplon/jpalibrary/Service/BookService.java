package co.simplon.jpalibrary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.jpalibrary.entity.BookEntity;
import co.simplon.jpalibrary.Repository.BookRepository;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public List<BookEntity> getBooks() {
   return bookRepository.findAll();
  }

  public BookEntity getBookById(final Long id) {
   return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("L'identifiant fourni est incorrect"));
  }

  public Boolean isBookExisting(final Long id) {
    return bookRepository.existsById(id);
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
