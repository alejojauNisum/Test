package com.nisum.interview.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Data;

import java.util.Objects;


@Table(name = "books")
@Entity
@SequenceGenerator(name="books_seq", sequenceName="books_seq", allocationSize=1)
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="books_seq")
    private long id;

    private String title;

    private String author;

    private double price;

    private String code;

    private boolean available;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}