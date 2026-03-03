package br.com.src;

import java.time.LocalDate;

public class Receita {
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public Receita() {
        consulta = new Consulta();
        data = LocalDate.of(2026,02,22);
        descritivo = "Dipirona básica";
    }

    public Receita (Consulta consulta, LocalDate data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void preescrever() {

    }

    public void consultar() {

    }

    void mostrar() {
        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }
}