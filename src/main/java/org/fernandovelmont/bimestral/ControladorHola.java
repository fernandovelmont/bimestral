/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fernandovelmont.bimestral;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fernandodaniel
 */
@RestController
@CrossOrigin
public class ControladorHola {
//Mapeo --> Metodo:HTTP --> Headers--> Fromato de respuesta
    //Dominio del servidor-- 
    @RequestMapping(value="/hola",
            method=RequestMethod.GET ,headers= {"Accept=text/html"})
    public String saludar(){
        return "Mi primer servicio REST";
    }
}

