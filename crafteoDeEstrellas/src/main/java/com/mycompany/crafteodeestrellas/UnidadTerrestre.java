/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crafteodeestrellas;

/**
 *
 * @author usuario1
 */
public abstract class UnidadTerrestre implements Unidad {
    protected String nombre;
    protected int vida;
    protected int ataque;

    public UnidadTerrestre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void habilidadEspecial();

    @Override
    public void mover() {

    }

    @Override
    public void atacar() {

    }
}
