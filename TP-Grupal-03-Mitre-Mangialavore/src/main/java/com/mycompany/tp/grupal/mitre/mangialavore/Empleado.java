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
public class Empleado{
	private String nombre;
	private int edad;
	private int IdEmple;
	private int numtel;
	private SueldoNeto sueldo;
	
 public Empleado(String nombre, int edad, int IdEmpleado, int numtel, SueldoNeto sueldo){
        this.nombre=nombre;
        this.edad= edad;
	this.IdEmple=IdEmpleado;
	this.numtel=numtel;
	this.sueldo=sueldo;
    }
public void mostrarDatos(){
        System.out.println(this.nombre+" "+this.edad+" "+this.IdEmple+" "+this.numtel + " "+ this.sueldo);
    }
 public String toString(){
        return this.nombre + " " + this.edad + " " + this.IdEmple + " " + this.numtel+ " " + this.sueldo;
    }
}
