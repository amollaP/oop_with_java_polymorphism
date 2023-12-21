package oop_with_java_polymorphism;

/*
    Polimorfismo Dinâmico ((Method Overriding) Substituição de Método

    Usando o recurso de substituicao do método do Java, voce pode substituir os método do Java, vc
    pode substituir os métodos de uma Classe Pai de sua Classe Filha

 */
public class Animal { //Classe Generica
    //Nome do minha (Procedure) Procedimento é "Comer"
    
    //Procedure comer é o método da classe Generica Animal e é compartilhado com suas classes filhas
    //será substituido na classe Filha
    public void comer()
    {
        //Come de tudoo. Generico
        System.out.println("O Animal é Onivoro");
    }

}
