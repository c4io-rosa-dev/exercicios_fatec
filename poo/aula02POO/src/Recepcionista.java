package br.com.src;

public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public Recepcionista() {
        nome = "Samanta";
        cpf = "544";
        telefone = "11 951";
        senha = "321";
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void acessar() {

    }

    void mostrar () {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + nome);
        System.out.println("Senha: " + senha);
    }
}