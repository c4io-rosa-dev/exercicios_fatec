package br.com.src;

import java.time.LocalDate;

public class Procedimento {
    public LocalDate data;
    public String descritivo;

    public Procedimento() {
        data = LocalDate.of(2026, 02, 22);
        descritivo = "Sem descrição";
    }

    public Procedimento(LocalDate data, String descritivo) {
        try {
            if (data == null || descritivo == null) {
                throw new Exception("Dados inválidos");
            }
            this.data = data;
            this.descritivo = descritivo;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.data = null;
            this.descritivo = null;
        }
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

    public void consultar() {
        System.out.println("Procedimento em " + data + ": " + descritivo);
    }

    void mostrar() {
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }
}