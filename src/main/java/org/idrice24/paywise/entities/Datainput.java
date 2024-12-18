package org.idrice24.paywise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Datainput {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String username;
private int userage;



public Datainput() {
}

public Datainput(Long id, String username, Double salary) {
    this.id = id;
    this.username = username;
    this.salary = salary;
}
public void setId(Long id) {
    this.id = id;
}
public void setUsername(String username) {
    this.username = username;
}
public void setUserage(int userage) {
    this.userage = userage;
}
public void setUseremail(String useremail) {
    this.useremail = useremail;
}
public void setUsergender(String usergender) {
    this.usergender = usergender;
}
public void setSalary(Double salary) {
    this.salary = salary;
}
public void setDette(Double dette) {
    this.dette = dette;
}
public void setCurrency(String currency) {
    this.currency = currency;
}
public Long getId() {
    return id;
}
public String getUsername() {
    return username;
}
public int getUserage() {
    return userage;
}
public String getUseremail() {
    return useremail;
}
public String getUsergender() {
    return usergender;
}
public Double getSalary() {
    return salary;
}
public Double getDette() {
    return dette;
}
public String getCurrency() {
    return currency;
}
private String useremail;
private String usergender;
private Double salary;
private Double dette;
private String currency;
}
