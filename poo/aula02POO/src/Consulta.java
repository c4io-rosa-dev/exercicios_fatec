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

    public Consulta() {
        data = LocalDate.of(2026,02,22);
        hora = LocalTime.of(22,11);
        medico = new Medico();
        paciente = new Paciente();
        motivo = "Rotina";
        historico = "Sem informações";
    }

    public Consulta(LocalDate data, LocalTime hora, Medico medico, Paciente paciente, String motivo, String historico) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.historico = historico;
    }

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