package br.com.src;

import java.time.LocalDate;

public class Exame extends Procedimento {
    // Atributo específico (data e descritivo são herdados de Procedimento)
    public Consulta consulta;

    public Exame() {
        super(LocalDate.of(2026, 02, 22), "Rotina");
        consulta = new Consulta();
    }

    public Exame(Consulta consulta, LocalDate data, String descritivo) {
        super(data, descritivo);
        try {
            if (consulta == null) {
                throw new Exception("Dados inválidos");
            }
            this.consulta = consulta;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.consulta = null;
        }
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    // consultar() é herdado de Procedimento

    public void solicitar() {
        System.out.println("Exame solicitado em " + data + ": " + descritivo);
    }

    @Override
    void mostrar() {
        System.out.println("Consulta: " + consulta);
        super.mostrar();
    }
}