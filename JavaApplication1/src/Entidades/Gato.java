/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Claudio
 */
public class Gato extends Animal {
    
    public Gato(String nombre, String raza, String alimento, int edad) {
        super(nombre, raza, alimento, edad);
    }

    @Override
    public void mostrarAlimento() {
        System.out.println("el gato come: "+alimento);
    }
    
    
}
