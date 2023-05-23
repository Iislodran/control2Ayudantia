/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crafteodeestrellas;

/**
 *
 * @author usuario1
 */
public class Zergling implements Unidad{
    private String nombre;
    
    public Zergling(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void mover() {
        System.out.println("Esta corriendo por el terreno");
    }

    @Override
    public void atacar() {
        System.out.println("Esta mordiendo al enemigo");
    }
    

    public void habilidadEspecial() {
        System.out.println(nombre + "Se enterró para esconderse.");
    }
}
