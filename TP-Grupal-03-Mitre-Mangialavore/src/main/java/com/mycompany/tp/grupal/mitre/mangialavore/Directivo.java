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
public class Directivo extends Empleado{
    private int subordinado;
    
    public Directivo(String nombre, int edad, int IdEmpleado, int numtel, SueldoNeto sueldo, int su) {
        super(nombre, edad, IdEmpleado, numtel, sueldo);
        this.subordinado = su;
    }
    public void mostrarDatos(){
        //String devol = super.toString() + this.subordinados;
        //return devol;
        System.out.println(super.toString() + "\n Sus subordinados son: " + this.subordinado);
    }
}


