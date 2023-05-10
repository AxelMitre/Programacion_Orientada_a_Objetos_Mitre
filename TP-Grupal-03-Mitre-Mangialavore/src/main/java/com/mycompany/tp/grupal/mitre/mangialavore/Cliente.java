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
public class Cliente {
    private String nombre;
    private int edad;
    private int idCliente;
    private int telefono;
    
    public Cliente(String nombre, int edad, int idcCliente, int telefono){
        this.nombre = nombre;
        this.edad =  edad;
        this.idCliente = idcCliente;
        this.telefono = telefono;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+ this.nombre + "\n Edad: " +this.edad + "\n id del cliente: " + this.idCliente + "\n Telefono:" + this.telefono);
    }
}