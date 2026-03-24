package br.com.src;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // Paciente
        Paciente newPaciente = new Paciente();
        newPaciente.nome = "Caio Rosa";
        newPaciente.cpf = "123456789-00";
        newPaciente.telefone = "11999999";
        newPaciente.genero = "Masculino";
        newPaciente.idade = 19;

        // Médico (agora herda nome, telefone e senha de Funcionario)
        Medico doutor = new Medico();
        doutor.nome = "Cleber";
        doutor.crm = "666";
        doutor.telefone = "11999";
        doutor.especialidade = "Cardiologia";
        doutor.senha = "123";

        // Recepcionista (agora herda nome, telefone e senha de Funcionario)
        Recepcionista newRecepcionista = new Recepcionista();
        newRecepcionista.nome = "Claúdia";
        newRecepcionista.cpf = "123456789-00";
        newRecepcionista.telefone = "11999";
        newRecepcionista.senha = "321";

        // Agenda
        Agenda newAgenda = new Agenda();
        newAgenda.data = LocalDate.of(2026, 2, 22);
        newAgenda.hora = LocalTime.of(15, 40, 0);
        newAgenda.medico = doutor;
        newAgenda.paciente = newPaciente;

        // Consulta
        Consulta newConsulta = new Consulta();
        newConsulta.data = LocalDate.of(2026, 2, 22);
        newConsulta.hora = LocalTime.of(15, 40, 0);
        newConsulta.medico = doutor;
        newConsulta.paciente = newPaciente;
        newConsulta.motivo = "rotina";
        newConsulta.historico = "Novo histórico";

        // Receita (agora herda data e descritivo de Procedimento)
        Receita newReceita = new Receita();
        newReceita.consulta = newConsulta;
        newReceita.data = LocalDate.of(2026, 02, 22);
        newReceita.descritivo = "Receita para remédio X";

        // Exame (agora herda data e descritivo de Procedimento)
        Exame newExame = new Exame();
        newExame.consulta = newConsulta;
        newExame.data = LocalDate.of(2026, 02, 22);
        newExame.descritivo = "Exame cardiológico";

        System.out.println("========== DADOS ==========");
        System.out.println("\n--- Paciente ---");
        newPaciente.mostrar();
        System.out.println("\n--- Médico ---");
        doutor.mostrar();
        System.out.println("\n--- Recepcionista ---");
        newRecepcionista.mostrar();
        System.out.println("\n--- Agenda ---");
        newAgenda.mostrar();
        System.out.println("\n--- Consulta ---");
        newConsulta.mostrar();
        System.out.println("\n--- Receita ---");
        newReceita.mostrar();
        System.out.println("\n--- Exame ---");
        newExame.mostrar();

        // ========== DEMONSTRAÇÃO DE HERANÇA ==========
        System.out.println("\n========== HERANÇA: Funcionario ==========");
        System.out.println("Medico é Funcionario? " + (doutor instanceof Funcionario));
        System.out.println("Recepcionista é Funcionario? " + (newRecepcionista instanceof Funcionario));

        // Polimorfismo: tratar ambos como Funcionario
        Funcionario func1 = doutor;
        Funcionario func2 = newRecepcionista;
        System.out.println("\nAcessando via referência Funcionario:");
        func1.acessar();
        func2.acessar();

        System.out.println("\n========== HERANÇA: Procedimento ==========");
        System.out.println("Receita é Procedimento? " + (newReceita instanceof Procedimento));
        System.out.println("Exame é Procedimento? " + (newExame instanceof Procedimento));

        // Polimorfismo: tratar ambos como Procedimento
        Procedimento proc1 = newReceita;
        Procedimento proc2 = newExame;
        System.out.println("\nConsultando via referência Procedimento:");
        proc1.consultar();
        proc2.consultar();

        // Métodos específicos das subclasses
        System.out.println("\nMétodos específicos:");
        newReceita.preescrever();
        newExame.solicitar();
    }
}