package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "bookuser")
public class BookUser {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name = "bookid", nullable = false)
    private long book_id;

    @Column(name = "userid", nullable = false)
    private long user_id;

    public BookUser() {

    }

    public BookUser(long book_id, long user_id) {
        this.book_id = book_id;
        this.user_id = user_id;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
