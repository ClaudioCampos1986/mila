/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Claudio
 */
public final class Caballo extends Animal {
    
    public Caballo(String nombre, String raza, String alimento, int edad) {
        super(nombre, raza, alimento, edad);
    }

    @Override
    public void mostrarAlimento() {
        System.out.println("el caballo come: "+alimento);
    }
    
}
