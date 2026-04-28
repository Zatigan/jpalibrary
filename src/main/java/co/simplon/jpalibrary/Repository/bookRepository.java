package co.simplon.jpalibrary.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.jpalibrary.entity.Book;

@Repository
public interface bookRepository extends CrudRepository<Book, Long> {

 
}
