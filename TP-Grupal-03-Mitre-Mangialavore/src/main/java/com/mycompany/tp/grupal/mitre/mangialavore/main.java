/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp.grupal.mitre.mangialavore;

import java.util.Scanner;

/**
 *
 * @author CS-07
 */
public class main {
    public static void main(String[] args) {
        DatoEmpre();
    }

    private static void DatoEmpre() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la empresa");
        String nom = lector.next();
        Empleado[] empleado = DatoEmple();
        Cliente[] cliente = DatoCliente();
        Empresa empresa = new Empresa(nom, empleado, cliente);
    }

    private static Empleado[] DatoEmple() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos empleados va a ingresar: ");
        int cant =lector.nextByte();
        System.out.println("Cuantos directivos vas a ingresar: ");
        int cantd =lector.nextByte();
        System.out.println("Cuantos subordinados vas a ingresar: ");
        int cants =lector.nextByte();
        Empleado[] empleado = new Empleado[cant];
        SueldoNeto[] sueldoneto = new SueldoNeto[cant];
        Subordinado[] subordinado = new Subordinado[cants];
        Directivo[] directivo = new Directivo[cantd];
        int num = 0;
        int sueldo = 10000;
        double os = 3/100 * sueldo;
        double prese = 10/100 * sueldo ;
        for (int i = 0; i < cant; i++) {
            System.out.println("Cual es el nombre del empleado: ");
            String nom = lector.next();
            System.out.println("Cual es la edad del empleado: ");
            int edad = lector.nextInt();
            int idemple = num + 1;
            System.out.println("Ingrese el numero de telefono del empleado");
            int numtl = lector.nextInt();
            System.out.println("Cual es el cargo del empleado: ");
            String cargo = lector.next();
            if (cargo.equals("directivo")) {
                System.out.println("Cuantos subordinados tenes: ");
                int camts = lector.nextInt();
                String carg = "directivo";
                sueldoneto[i]= new SueldoNeto(carg, sueldo, os, prese);
                //String cargo ,double sueldoB, double obraS, double presentismo
                directivo[i] = new Directivo(nom, edad, idemple, numtl, sueldoneto[i], camts);
                //String nombre, int edad, int IdEmpleado, int numtel, sueldoNeto sueldo, int su
            }
            if (cargo.equals("subordinado")) {
                String carg = "subordinado";
                sueldoneto[i]= new SueldoNeto(carg, sueldo, os, prese);
                subordinado[i] = new Subordinado(nom, edad, idemple, numtl, sueldoneto[i]);
            }
            empleado[i] = new Empleado(nom, edad, idemple, numtl, sueldoneto[i]);
        }
        return empleado;
    }
    private static Cliente[] DatoCliente() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos clientes vas a ingresar ");
        int num = 0;
        int cant = lector.nextInt();
        Cliente[] cliente = new Cliente[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del cliente");
            String nom = lector.next();
            System.out.println("Ingrese la edad del cliente");
            int numedad = lector.nextInt();
            int idclien = num + 1;
            System.out.println("ingrese el numero de telefono del cliente");
            int numetel = lector.nextInt();
            cliente[i] = new Cliente(nom, numedad, idclien, numetel);
        }
        return cliente;
    }
}
