package javaapplication1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;





public class Animales {

 

    public static void main(String[] args) {
     //Declaracion del objeto Perro
        Animal perro1 = new Perro ("Stich", "Doberman", "carnivoro", 15);
        perro1.mostrarAlimento();
        
        //Declaracion de otro objeto perro
        Animal perro2 = new Perro("Teddy", "chihuahua", "Croquetas", 10);
        perro2.mostrarAlimento();
        
        //Declaracion del objeto Gato
       Animal gato1= new Gato("Pelusa", "Siames", "Galletas", 15);
        gato1.mostrarAlimento();
        
        //Declaracion del objeto Caballo
        Animal caballo1 =new Caballo("Spark", "Fino", "pasto", 25);
        caballo1.mostrarAlimento();   
    }
}