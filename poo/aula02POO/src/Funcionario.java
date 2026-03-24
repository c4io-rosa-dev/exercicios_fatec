package br.com.src;

public class Funcionario {
    public String nome;
    public String telefone;
    public String senha;

    public Funcionario() {
        nome = "Funcionario";
        telefone = "00 000000000";
        senha = "000";
    }

    public Funcionario(String nome, String telefone, String senha) {
        try {
            if (nome == null || telefone == null || senha == null) {
                throw new Exception("Dados inválidos");
            }
            this.nome = nome;
            this.telefone = telefone;
            this.senha = senha;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.nome = null;
            this.telefone = null;
            this.senha = null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar() {
        System.out.println("Funcionário " + nome + " acessou o sistema.");
    }

    void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
    }
}