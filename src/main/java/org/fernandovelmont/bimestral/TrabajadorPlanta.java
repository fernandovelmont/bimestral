/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fernandovelmont.bimestral;

/**
 *
 * @author Fernandodaniel
 */
public class TrabajadorPlanta extends Trabajador implements Nomina {
private float SueldoBase;
    @Override
    public String pagarNomina() {
    return "Se pago la nomina del trabajador de planta ";
    }

    public float getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(float SueldoBase) {
        this.SueldoBase = SueldoBase;
    }
    
}
