/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fernandovelmont.bimestral;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
//Mapeo --> Metodo:HTTP --> Headers--> Formato de respuesta
    //Dominio del servidor-- 
    @RequestMapping(value="/hola/{mensaje}",
            method=RequestMethod.GET ,headers= {"Accept=text/html"})
    public String saludar(@PathVariable String mensaje){
        String algo="Bienvenido "+mensaje;
        return algo;
    }
    @RequestMapping(value="/usuario", method=RequestMethod.GET,headers={"Accept=application/json"})
    public ArrayList<Usuario> obtener(){
        Usuario u1=new Usuario("Fernando Daniel","Velazquez",20);
        Usuario u2=new Usuario("Zorro","Velazquez",15);
        ArrayList<Usuario> usuarios=new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        return usuarios;
    }
    
}

