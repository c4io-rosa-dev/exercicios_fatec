package clinica;

public class Recepcionista extends Funcionario {
    public String cpf;

    public Recepcionista() {
        super("Samanta", "11 951", "321");
        cpf = "544";
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        super(nome, telefone, senha);
        try {
            if (cpf == null) {
                throw new Exception("Dados inválidos");
            }
            this.cpf = cpf;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.cpf = null;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    void mostrar() {
        super.mostrar();
        System.out.println("CPF: " + cpf);
    }
}
