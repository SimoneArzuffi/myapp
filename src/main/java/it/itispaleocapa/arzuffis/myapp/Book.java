package it.itispaleocapa.arzuffis.myapp;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "publisher", referencedColumnName = "id")
    private Publisher publisher;

    //getter
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    
}