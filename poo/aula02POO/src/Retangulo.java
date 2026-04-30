package br.com.src;

public class Retangulo implements FormasGeometricas {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public int quantidadeArestas() {
        return 4;
    }
}