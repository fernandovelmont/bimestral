/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fernandovelmont.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Fernandodaniel
 */
@Entity
@Table(name="Boleto")

public class Boleto {

@Id
@GeneratedValue // es el equivalente del autoincremento
@Column(name="id_boleto")
private Long id;

    @Override
    public String toString() {
        return "Boleto{" + "id=" + id + ", sala=" + sala + ", costo=" + costo + '}';
    }

    public Boleto(Long id, SalaCine sala, Float costo) {
        this.id = id;
        this.sala = sala;
        this.costo = costo;
    }

    public Boleto() {
    }

@ManyToOne
@JoinColumn(name="id_sala")
private SalaCine sala;

@Column(name="costo_boleto")
private Float costo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }
}


}