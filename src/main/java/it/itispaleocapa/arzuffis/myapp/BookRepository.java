package it.itispaleocapa.arzuffis.myapp;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
 
 
    @Query(value = ""+
    " SELECT b.* " +
    " FROM BOOK b" +
    " WHERE b.TITLE LIKE %:title%"+
    "", nativeQuery = true)
    List<Book> likeByTitle(@Param("title") String title);
 }
 