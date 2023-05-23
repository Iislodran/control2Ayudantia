/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crafteodeestrellas;

/**
 *
 * @author usuario1
 */
public class Marine extends UnidadTerrestre {
    public Marine(String nombre) {
        super(nombre);
    }
    
      @Override
    public void mover() {
        System.out.println("Está avanzando por el terreno");
    }

    @Override
    public void atacar() {
        System.out.println("Está disparando al enemigo");
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " ha utilizado Estimulantes de Combate.");
    }
}
