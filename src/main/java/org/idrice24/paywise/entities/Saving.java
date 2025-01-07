package org.idrice24.paywise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Saving {
    @Id
    private Long id;
    private double pdebit;
    private double smensuel;
    private double salaire;
    private double location;
    private double loisir;
    private int month;
    private double nutrition;
    private double auto;
    private double vaccance;
    private double vetement;
    private double sport;
    private double dette;
    private double tontine;
    private double epargne;
    private double telephone;
    private double netflix;
    private double spotify;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getPdebit() {
        return pdebit;
    }
    public void setPdebit(double pdebit) {
        this.pdebit = pdebit;
    }
    public double getSmensuel() {
        return smensuel;
    }
    public void setSmensuel(double smensuel) {
        this.smensuel = smensuel;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public double getLocation() {
        return location;
    }
    public void setLocation(double location) {
        this.location = location;
    }
    public double getLoisir() {
        return loisir;
    }
    public void setLoisir(double loisir) {
        this.loisir = loisir;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public double getNutrition() {
        return nutrition;
    }
    public void setNutrition(double nutrition) {
        this.nutrition = nutrition;
    }
    public double getAuto() {
        return auto;
    }
    public void setAuto(double auto) {
        this.auto = auto;
    }
    public double getVaccance() {
        return vaccance;
    }
    public void setVaccance(double vaccance) {
        this.vaccance = vaccance;
    }
    public double getVetement() {
        return vetement;
    }
    public void setVetement(double vetement) {
        this.vetement = vetement;
    }
    public double getSport() {
        return sport;
    }
    public void setSport(double sport) {
        this.sport = sport;
    }
    public double getDette() {
        return dette;
    }
    public void setDette(double dette) {
        this.dette = dette;
    }
    public double getTontine() {
        return tontine;
    }
    public void setTontine(double tontine) {
        this.tontine = tontine;
    }
    public double getEpargne() {
        return epargne;
    }
    public void setEpargne(double epargne) {
        this.epargne = epargne;
    }
    public double getTelephone() {
        return telephone;
    }
    public void setTelephone(double telephone) {
        this.telephone = telephone;
    }
    public double getNetflix() {
        return netflix;
    }
    public void setNetflix(double netflix) {
        this.netflix = netflix;
    }
    public double getSpotify() {
        return spotify;
    }
    public void setSpotify(double spotify) {
        this.spotify = spotify;
    }

    

}
