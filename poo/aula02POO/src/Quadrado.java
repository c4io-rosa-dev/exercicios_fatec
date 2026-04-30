package br.com.src;

public class Quadrado implements FormasGeometricas {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public int quantidadeArestas() {
        return 4;
    }
}