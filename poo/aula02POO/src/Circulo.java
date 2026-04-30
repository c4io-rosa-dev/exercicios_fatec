package br.com.src;

public class Circulo implements FormasGeometricas {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public int quantidadeArestas() {
        return 0; // círculo não tem arestas
    }
}