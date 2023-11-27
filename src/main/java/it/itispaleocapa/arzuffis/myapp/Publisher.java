package it.itispaleocapa.arzuffis.myapp;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;



@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    //getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Publisher: " + this.name;
    }
}