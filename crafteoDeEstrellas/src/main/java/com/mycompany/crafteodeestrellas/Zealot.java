/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crafteodeestrellas;

/**
 *
 * @author usuario1
 */
public class Zealot implements Unidad {
    private String nombre;

    public Zealot(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mover() {
        System.out.println(nombre + " se está moviendo rápidamente.");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " está utilizando sus cuchillas psi en el combate.");
    }
    
    public void habilidadEspecial() {
        System.out.println(nombre + "Tiene escudos aparte de la vida inicial.");
    }
}