package oop_with_java_polymorphism;

/*
    Polimorfismo Estático: ("Method Overloading" -->> Sobrecarga de método)
    A sobrecarga de método significa que vc pode ter vários métodos com o mesmo nome dentro de uma classe.
    Entretanto, o numero de nomes ou os tipos de seus parametros precisa ser diferentes.
    
 */
public class Pessoa {
    
    //Procedimento com o nome (acaoPaloma), porém, sem parametros
    public void acaoPaloma()
    {
        System.out.println("Palloma estuda todos os dias");
    }
    
    //Procedimento com o nome (acaoPaloma), porém, com 1 parametro
    public void acaoPaloma(String acao)
    {
        System.out.println("Ação: " + acao);
    }
    
    //Procedimento com o nome (acaoPaloma), porém, com 2 parametros
    public void acaoPaloma(int idade, String nome)
    {
        System.out.println("Idade: " + idade + " Nome: " + nome);
    }
    
    //Procedimento com o nome (acaoPaloma), porém, com 3 parametros
    public void acaoPaloma(int idade, String nome, String acao)
    {
        System.out.println("Idade: " + idade + " Nome: " + nome + " Ação: " + acao);
    }
    
    //Procedimento com o nome (acaoPaloma), porém, com 4 parametros
    public void acaoPaloma(int idade, String nome, String acao, char character)
    {
        System.out.println("Idade: " + idade + " Nome: " + nome + " Ação: " + acao);
    }
}
