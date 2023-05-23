/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crafteodeestrellas;

/**
 *
 * @author usuario1
 */
public class CrafteoDeEstrellas {
    public static void main(String[] args) {
        Marine marine = new Marine("Jim Raynor");
        marine.mover();
        marine.atacar();
        marine.habilidadEspecial();

        Zergling zergling = new Zergling("Devourer");
        zergling.mover();
        zergling.atacar();
        zergling.habilidadEspecial();

        Zealot zealot = new Zealot("Artanis");
        zealot.mover();
        zealot.atacar();
        zealot.habilidadEspecial();
    }
}    