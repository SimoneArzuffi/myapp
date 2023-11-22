

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    @Query(value = ""+
        " SELECT b.*, p.NAME" +
        " FROM BOOK b INNER JOIN PUBLISHER p ON b.PUBLISHER = p.ID" +
        " WHERE p.NAME ILIKE %:name%" +
        "", nativeQuery = true)
    List<Book> findByPublisher(@Param("name") String name);
} // Add closing curly brace here

