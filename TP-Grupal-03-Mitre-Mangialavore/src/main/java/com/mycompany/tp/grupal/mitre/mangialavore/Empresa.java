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
public class Empresa {
    private String nombre;
    private Empleado[] emp;
    private Cliente[] cli;
    public Empresa(String nombre, Empleado[] emp, Cliente[] cli){
        this.nombre = nombre;
        this.emp =  emp;
        this.cli = cli;
    }
    public void MostrarDatos(){
        System.out.println("Nombre de la empresa "+ this.nombre + "Nombre de sus empleados " + this.emp + "Nombre de sus clientes " +this.cli);
    }
}
