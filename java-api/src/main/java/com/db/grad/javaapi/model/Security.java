package com.db.grad.javaapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Table(name = "security")
public class Security {

    @Id
    private long id;
    @Column(name = "isin")
    private String ISIN;
    @Column(name = "cusip")
    private String CUSIP;
    @Column(name = "issuer")
    private String Issuer;
    @Column(name = "maturity_date")
    private Date MaturityDate;
    @Column(name = "coupon")
    private String Coupon;
    @Column(name = "type")
    private String Type;
    @Column(name = "face_value")
    private double FaceValue;
    @Column(name = "status")
    private String Status;

    public Security() {

    }

    public Security(long id, String ISIN, String CUSIP, String issuer, Date maturityDate, String coupon, String type, double faceValue, String status) {
        this.id = id;
        this.ISIN = ISIN;
        this.CUSIP = CUSIP;
        Issuer = issuer;
        MaturityDate = maturityDate;
        Coupon = coupon;
        Type = type;
        FaceValue = faceValue;
        Status = status;
    }

    @Id
    public long getId() {
        return id;
    }

//    @Column(name = "ISIN", nullable = false)
    public String getISIN() {
        return ISIN;
    }

//    @Column(name = "CUSIP", nullable = false)
    public String getCUSIP() {
        return CUSIP;
    }

//    @Column(name = "CUSIP", nullable = false)
    public String getIssuer() {
        return Issuer;
    }

//    @Column(name = "CUSIP", nullable = false)
    public Date getMaturityDate() {
        return MaturityDate;
    }

//    @Column(name = "CUSIP", nullable = false)
    public String getCoupon() {
        return Coupon;
    }

//    @Column(name = "CUSIP", nullable = false)
    public String getType() {
        return Type;
    }

//    @Column(name = "CUSIP", nullable = false)
    public double getFaceValue() {
        return FaceValue;
    }

    public String getStatus() {
        return Status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }

    public void setCUSIP(String CUSIP) {
        this.CUSIP = CUSIP;
    }

    public void setIssuer(String issuer) {
        Issuer = issuer;
    }

    public void setMaturityDate(Date maturityDate) {
        MaturityDate = maturityDate;
    }

    public void setCoupon(String coupon) {
        Coupon = coupon;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setFaceValue(double faceValue) {
        FaceValue = faceValue;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
