package org.idrice24.paywise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;

@Entity
@Table(name="details")
@SecondaryTable(name="location")
@SecondaryTable(name="loisirr")
@SecondaryTable(name="vaccance")
@SecondaryTable(name="auto")
@SecondaryTable(name="vetement")
@SecondaryTable(name="sport")
@SecondaryTable(name="dette")
@SecondaryTable(name="tontine")
@SecondaryTable(name="epargne")
@SecondaryTable(name="telephone")
@SecondaryTable(name="spotify")
@SecondaryTable(name="netflix")
@SecondaryTable(name="dept")
@SecondaryTable(name="others")
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private double january;
    private double february;
    private double march;
    private double april;
    private double mai;
    private double june;
    private double july;
    private double august;
    private double september;
    private double october;
    private double november;
    private double december;
    
    public Details() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getJanuary() {
        return january;
    }

    public void setJanuary(double january) {
        this.january = january;
    }

    public double getFebruary() {
        return february;
    }

    public void setFebruary(double february) {
        this.february = february;
    }

    public double getMarch() {
        return march;
    }

    public void setMarch(double march) {
        this.march = march;
    }

    public double getApril() {
        return april;
    }

    public void setApril(double april) {
        this.april = april;
    }

    public double getMai() {
        return mai;
    }

    public void setMai(double mai) {
        this.mai = mai;
    }

    public double getJune() {
        return june;
    }

    public void setJune(double june) {
        this.june = june;
    }

    public double getJuly() {
        return july;
    }

    public void setJuly(double july) {
        this.july = july;
    }

    public double getAugust() {
        return august;
    }

    public void setAugust(double august) {
        this.august = august;
    }

    public double getSeptember() {
        return september;
    }

    public void setSeptember(double september) {
        this.september = september;
    }

    public double getOctober() {
        return october;
    }

    public void setOctober(double october) {
        this.october = october;
    }

    public double getNovember() {
        return november;
    }

    public void setNovember(double november) {
        this.november = november;
    }

    public double getDecember() {
        return december;
    }

    public void setDecember(double december) {
        this.december = december;
    }
    


    


}
