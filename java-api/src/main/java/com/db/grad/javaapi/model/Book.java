package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

    @Id
    private long id;

    // Attributes
    @Column(name = "bookname", nullable = false)
    private String bookname;

    public Book() {

    }

    public Book(long id, String bookname) {
        this.id = id;
        this.bookname = bookname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

}
