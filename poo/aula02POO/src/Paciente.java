package br.com.src;

public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    public Paciente() {}

    public void cadastrar() {

    }

    public void consultar() {

    }

    void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Gênero: " + genero);
        System.out.println("Idade: " + idade);
    }
}