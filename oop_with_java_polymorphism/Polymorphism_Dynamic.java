package oop_with_java_polymorphism;

/*
    Testar Polimorfismo Dinamico
 */
public class Polymorphism_Dynamic {
    
    public static void main(String [] args)
    {
        //Classe Genérica
        Animal animal = new Animal();
        animal.comer(); //call the procedure
        
        //Classe Especifíca
        Lagarto lagarto = new Lagarto();
        lagarto.comer(); //call the procedure
    }
    
}
