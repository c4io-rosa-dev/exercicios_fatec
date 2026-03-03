package br.com.src;

public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    public Paciente() {
        nome = "Caio";
        cpf = "544";
        telefone = "11 951667716";
        genero = "Masculino";
        idade = 19;
    }

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
    }

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