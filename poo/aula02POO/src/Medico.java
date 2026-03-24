package br.com.src;

public class Medico extends Funcionario {
    // Atributos específicos (nome, telefone e senha são herdados de Funcionario)
    public String crm;
    public String especialidade;

    public Medico() {
        super("Doutor", "11 951", "123");
        crm = "344";
        especialidade = "Cardiologia";
    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        super(nome, telefone, senha);
        try {
            if (crm == null || especialidade == null) {
                throw new Exception("Dados inválidos");
            }
            this.crm = crm;
            this.especialidade = especialidade;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.crm = null;
            this.especialidade = null;
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // acessar() é herdado de Funcionario

    @Override
    void mostrar() {
        super.mostrar();
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
    }
}