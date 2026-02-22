package br.com.src;

import java.time.LocalDate;

public class Exame {
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public Exame() {}

    public void solicitar() {

    }

    public void consultar() {

    }

    void mostrar() {
        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }
}