/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp.grupal.mitre.mangialavore;

/**
 *
 * @author CS-07
 */
public class SueldoNeto{
    private String cargo;
    private double sueldoB;
    private double obraS;
    private double presentismo;
    private char genero;
    
    public SueldoNeto(String cargo ,double sueldoB, double obraS, double presentismo){
        this.cargo = cargo;
        this.sueldoB = sueldoB;
        this.obraS = obraS;
        this.presentismo = presentismo;
    }

    SueldoNeto(int carg, int sueldo, int os, int prese) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public double CalcuarSB(){
        return this.sueldoB;
    }
    public double calcularSN(){
        this.obraS = 3/100 * this.sueldoB;
        this.presentismo = 10/100 * this.sueldoB;
        double num = 0.0;
        num = this.sueldoB - this.obraS + this.presentismo;
        return num;
    }
    public String datosSueldo(){
        String sueldo = this.cargo + this.sueldoB+ this.obraS+ this.presentismo + this.genero;
        return(sueldo);
    }
}

