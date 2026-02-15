// 1) Escreva uma função recursiva para calcular o valor de uma base x elevada a um expoente y.
#include <stdio.h>

int elevacaoRec(int x, int y) {
    if (y == 0) return 1;
    return x * (elevacaoRec(x, y-1));
}

// 2) Escreva uma função recursiva pra calcular uma sequencia fibonacci.
int fibonacciRec(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacciRec(n-1) + fibonacciRec(n-2);
}

// main
int main() {
    printf("Resultado: %i", elevacaoRec(20, 3));
    printf("Resultado: %i", fibonacciRec(20));

    return 0;
}