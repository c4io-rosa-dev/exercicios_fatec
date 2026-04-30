package br.com.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--------------------------");
            System.out.println("POO 8 - Interfaces");
            System.out.println("--------------------------\n");

            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1) Calcular área do círculo");
            System.out.println("2) Calcular área do triângulo");
            System.out.println("3) Calcular área do quadrado");
            System.out.println("4) Calcular número de arestas do quadrado");
            System.out.println("5) Calcular área do retângulo");
            System.out.println("0) Sair");

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Insira o valor do raio:");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("Área do círculo: " + circulo.calculaArea());
                    break;

                case 2:
                    System.out.println("Insira a base do triângulo:");
                    double baseT = scanner.nextDouble();
                    System.out.println("Insira a altura do triângulo:");
                    double alturaT = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseT, alturaT);
                    System.out.println("Área do triângulo: " + triangulo.calculaArea());
                    break;

                case 3:
                    System.out.println("Insira o lado do quadrado:");
                    double lado = scanner.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println("Área do quadrado: " + quadrado.calculaArea());
                    break;

                case 4:
                    Quadrado q = new Quadrado(0);
                    System.out.println("Número de arestas do quadrado: " + q.quantidadeArestas());
                    break;

                case 5:
                    System.out.println("Insira a base do retângulo:");
                    double baseR = scanner.nextDouble();
                    System.out.println("Insira a altura do retângulo:");
                    double alturaR = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(baseR, alturaR);
                    System.out.println("Área do retângulo: " + retangulo.calculaArea());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);

        scanner.close();
    }
}