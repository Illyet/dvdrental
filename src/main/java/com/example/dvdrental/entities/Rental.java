package com.example.dvdrental.entities;

import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name = "rentals")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Movie movie;

    @Column
    private int daysRented;

    public Rental() {

    }


    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

}
