package br.com.src;

public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;

    public Medico() {
        nome = "Doutor";
        crm = "344";
        telefone = "11 951";
        especialidade = "Cardiologia";
        senha = "123";
    }

    public Medico (String nome, String crm, String telefone, String especialidade, String senha) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }

    public void acessar() {

    }

    void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Senha: " + senha);
    }
}