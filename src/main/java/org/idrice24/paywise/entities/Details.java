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


}
