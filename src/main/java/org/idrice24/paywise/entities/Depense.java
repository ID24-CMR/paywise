package org.idrice24.paywise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="depense")
@Table(name = "depense")
public class Depense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Double location;
    private Double nutrition;
    private Double loisir;
    private Double vacance;
    private Double auto;
    private Double vetement;
    private Double sport;
    private Double dette;
    private Double tontine;
    private Double epargne;
    private Double telephone;
    private Double sportify;
    private Double netflix;
    private Double dept;


    



    public Depense() {
    }
    
    public Depense(long id, Double location, Double nutrition) {
        this.id = id;
        this.location = location;
        this.nutrition = nutrition;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Double getLocation() {
        return location;
    }
    public void setLocation(Double location) {
        this.location = location;
    }
    public Double getNutrition() {
        return nutrition;
    }
    public void setNutrition(Double nutrition) {
        this.nutrition = nutrition;
    }
    public Double getLoisir() {
        return loisir;
    }
    public void setLoisir(Double loisir) {
        this.loisir = loisir;
    }
    public Double getVacance() {
        return vacance;
    }
    public void setVacance(Double vacance) {
        this.vacance = vacance;
    }
    public Double getAuto() {
        return auto;
    }
    public void setAuto(Double auto) {
        this.auto = auto;
    }
    public Double getVetement() {
        return vetement;
    }
    public void setVetement(Double vetement) {
        this.vetement = vetement;
    }
    public Double getSport() {
        return sport;
    }
    public void setSport(Double sport) {
        this.sport = sport;
    }
    public Double getDette() {
        return dette;
    }
    public void setDette(Double dette) {
        this.dette = dette;
    }
    public Double getTontine() {
        return tontine;
    }
    public void setTontine(Double tontine) {
        this.tontine = tontine;
    }
    public Double getEpargne() {
        return epargne;
    }
    public void setEpargne(Double epargne) {
        this.epargne = epargne;
    }
    public Double getTelephone() {
        return telephone;
    }
    public void setTelephone(Double telephone) {
        this.telephone = telephone;
    }
    public Double getSportify() {
        return sportify;
    }
    public void setSportify(Double sportify) {
        this.sportify = sportify;
    }
    public Double getNetflix() {
        return netflix;
    }
    public void setNetflix(Double netflix) {
        this.netflix = netflix;
    }

    public void setDept(Double dept){
        this.dept = dept;
    }

    public Double getDept(){
        return dept;
    }
    
}
