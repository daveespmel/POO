/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Francisco Aramburu
 */
public abstract class Alumno3 {
    
    
    private String nom, curp, nacim, nomMad, nomPad, nomTut, nivel;

    protected Alumno3() {
    }

    protected Alumno3(String nom, String curp, String nacim, String nomMad, String nomPad, String nivel) {
        this.nom = nom;
        this.curp = curp;
        this.nacim = nacim;
        this.nomMad = nomMad;
        this.nomPad = nomPad;
        this.nivel = nivel;
    }

    protected Alumno3(String nom, String curp, String nacim, String nomTut, String nivel) {
        this.nom = nom;
        this.curp = curp;
        this.nacim = nacim;
        this.nomTut = nomTut;
        this.nivel = nivel;
    }
    
    
    
    
    
    
    
    
    
}
