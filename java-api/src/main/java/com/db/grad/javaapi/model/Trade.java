package com.db.grad.javaapi.model;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "trade")
public class Trade {

    @Id
    private long id;

    // Attributes
    @Column(name = "quantity", nullable = false)
    private long quantity;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "buysell", nullable = false)
    private String buysell;
    @Column(name = "tradedate", nullable = false)
    private Date tradedate;
    @Column(name = "settlementdate", nullable = false)
    private Date settlementdate;

    // Keys
    @Column(name = "bookid", nullable = false)
    private long bookid;
    @Column(name = "counterpartyid", nullable = false)
    private long counterpartyid;
    @Column(name = "securityid", nullable = false)
    private long securityid;

    public Trade() {
    }


    public Trade(long id, long quantity, String status, double price, String buysell, Date tradedate, Date settlementdate, long bookid, long counterpartyid, long securityid) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
        this.price = price;
        this.buysell = buysell;
        this.tradedate = tradedate;
        this.settlementdate = settlementdate;
        this.bookid = bookid;
        this.counterpartyid = counterpartyid;
        this.securityid = securityid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuysell() {
        return buysell;
    }

    public void setBuysell(String buysell) {
        this.buysell = buysell;
    }

    public Date getTradedate() {
        return tradedate;
    }

    public void setTradedate(Date tradedate) {
        this.tradedate = tradedate;
    }

    public Date getSettlementdate() {
        return settlementdate;
    }

    public void setSettlementdate(Date settlementdate) {
        this.settlementdate = settlementdate;
    }

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public long getCounterpartyid() {
        return counterpartyid;
    }

    public void setCounterpartyid(long counterpartyid) {
        this.counterpartyid = counterpartyid;
    }

    public long getSecurityid() {
        return securityid;
    }

    public void setSecurityid(long securityid) {
        this.securityid = securityid;
    }
}
