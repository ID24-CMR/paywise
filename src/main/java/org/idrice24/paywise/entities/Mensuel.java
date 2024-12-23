package org.idrice24.paywise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "mensuel")
public class Mensuel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    private double salaire;
    private String month;
    
    public Mensuel() {
    }
    
    public Mensuel(long id, double salaire, String month) {
        this.id = id;
        this.salaire = salaire;
        this.month = month;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    
}
