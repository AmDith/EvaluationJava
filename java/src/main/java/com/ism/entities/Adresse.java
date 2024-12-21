package com.ism.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "adresse")
@ToString()
public class Adresse extends AbstractEntity {

    @Column(length = 25,unique = true)
    private String ville;
    @Column(length = 25,unique = true)
    private String quartier;
    @Column(length = 25,unique = false)
    private String numeroVilla;

}
