package it.itispaleocapa.arzuffis.myapp;
import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = false)
    private String title;
    @ManyToOne
    @JoinColumn(name = "publisher", referencedColumnName = "id")
    //getter
    
}


