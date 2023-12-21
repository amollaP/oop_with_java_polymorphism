package oop_with_java_polymorphism;

public class Polymorphis_Static {
    
    public static void main(String[] args)
    {
        Pessoa person = new Pessoa();
        
        //Call procedure without parameter
        //Chama o procedimento sem parametro
        person.acaoPaloma();
        
        //Call procedure with parameter
        //Chama o procedimento sem parametro
        
        //2 Maneiras de resolver
        //Criando variaveis locais
        //ou passando string no parametro criando dentro do corpo da Procedure
        person.acaoPaloma("ação");
        
        person.acaoPaloma(15, "Maicon");
        
        person.acaoPaloma(99, "Maria", "Correr");
        
        //tipo char em Java é Aspas SIMPLES
        //tipo String em Java é Aspas DUPLAS
        person.acaoPaloma(20, "Ruth gente Boa", "Dançar", 'l');
    }
    
}
