package co.simplon.jpalibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.jpalibrary.entity.Book;

@Repository
public interface BBookRepository extends JpaRepository<Book, Long>{

}
