package test.demo.entity;


import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
@Entity
@Table(name="home")
public class Home {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="listingtypes")
    private String listingtypes;
    @Column(name="offertype")
    private String offertype;
    @Column(name="selectcity")
    private String selectcity;

    @Column(name="diachi")
    private String diachi;
    @Column(name="ten")
    private String ten;
    @Column(name="giatien")
    private String giatien;

    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListingtypes() {
        return listingtypes;
    }

    public void setListingtypes(String listingtypes) {
        this.listingtypes = listingtypes;
    }

    public String getOffertype() {
        return offertype;
    }

    public void setOffertype(String offertype) {
        this.offertype = offertype;
    }

    public String getSelectcity() {
        return selectcity;
    }

    public void setSelectcity(String selectcity) {
        this.selectcity = selectcity;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }
}
