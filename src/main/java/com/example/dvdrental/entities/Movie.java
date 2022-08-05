package com.example.dvdrental.entities;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    public static final int CHILDRENS = 2;

    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;


    @Column
    private String title;

    @Column
    private int priceCode;


    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public Movie() {

    }

    public int getPriceCode() {
        return priceCode;
    }


    public String getTitle() {
        return title;
    }

}
