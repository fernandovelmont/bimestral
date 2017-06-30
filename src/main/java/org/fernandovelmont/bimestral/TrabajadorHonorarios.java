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
public class TrabajadorHonorarios extends Trabajador implements Nomina {
private float iva;
private float isr;
    @Override
    public String pagarNomina() {
   return "Nomina del trabajador por honarios pagada";
        
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getIsr() {
        return isr;
    }

    public void setIsr(float isr) {
        this.isr = isr;
    }
   
    
}
