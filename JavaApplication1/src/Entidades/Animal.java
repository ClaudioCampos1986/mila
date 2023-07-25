/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Animal {
    
   protected String nombre;
    protected String raza;
    protected String alimento;
    protected int edad;

    public Animal(String nombre, String raza, String alimento, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.alimento = alimento;
        this.edad = edad;
    }
    
    public void mostrarAlimento(){
        System.out.println(this.alimento);
    }
    
}
