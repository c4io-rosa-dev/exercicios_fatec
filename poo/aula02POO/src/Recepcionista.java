package br.com.src;

public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public Recepcionista() {}

    public void acessar() {

    }

    void mostrar () {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + nome);
        System.out.println("Senha: " + senha);
    }
}