package br.com.src;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;
    public String motivo;
    public String historico;

    public Consulta() {}

    public void marcar() {

    }

    public void cancelar() {

    }

    public void consultar() {

    }

    public void realizar() {

    }

    public void atualizar() {

    }

    void mostrar() {
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico responsável: " + medico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + historico);
    }
}