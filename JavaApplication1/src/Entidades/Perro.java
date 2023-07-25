
package Entidades;


public class Perro extends Animal {

    public Perro(String nombre, String raza, String alimento, int edad) {
        super(nombre, raza, alimento, edad);
    }

    @Override
    public void mostrarAlimento() {
        System.out.println("el perro come: "+ alimento);
    }

    
    
    

    
    
    
           
    
    
    
}
