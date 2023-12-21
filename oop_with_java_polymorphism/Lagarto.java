package oop_with_java_polymorphism;

/*
    Essa classe Lagarto, irá herdar da classe Pai Animal
 */
//Classe especifica de um animal
public class Lagarto extends Animal {
    //Nome do minha (Procedure) Procedimento é "Comer"
    //Procedure comer eu HERDO DA CLASSE PAI ANIMAL, PORÉM A SAÍDA É ESPECIFICA DA CLASSE LAGARTO, OU SEJA, SUA ALIMENTAÇÃO PARTICULAR
    //Substituição na unha, na classe filha Lagarto que tem o respectiva classe Pai lagarto
    @Override
    public void comer()
    {
        //Come exclusivamente insetos. Alimentação restrita a insetos
        System.out.println("Este animal come Insetos");
    }
}
