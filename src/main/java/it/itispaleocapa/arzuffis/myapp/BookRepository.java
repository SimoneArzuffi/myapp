package it.itispaleocapa.arzuffis.myapp;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
 
 
    @Query(value = ""+
    " SELECT b.* " +
    " FROM BOOK b" +
    " WHERE b.TITLE LIKE %:title%"+
    "", nativeQuery = true)
    List<Book> likeByTitle(@Param("title") String title);
 }
 