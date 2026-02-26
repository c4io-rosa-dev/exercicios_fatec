#include <stdio.h>
// 1) Resposta: O valor de y no final do programa é 4;

// 2) a) Resposta: 
// p++; -> está linha de código incrementa 1 no valor de endereço da memória RAM
// (*p)++; -> esse valor incrementa 1 no valor da variável associada ao endereço p
// *(++p) -> quando ++p ocorre, o endereço é alterado. o papel de *(...) é resgatar o valor da variável do novo endereço

// 2) b) Resposta: *(p + 10) acessa o valor armazenado no endereço 10 posições à frente de p

// 3) Resposta: 
// x = 3
// y = 4
// p = endereço de y na memória RAM

// 4) Resposta:
// a) A variável p é um ponteiro, porém ela não recebe nenhum endereço de memória
// b) temp não precisa armazenar um endereço, então ele não precisa ser inicializado como uma variável
// c) o erro está em if(a < b) porque ele tenta comparar chars, mas acaba comparando os endereços de memória

// 5) Enunciado: Escreva uma função chamada troca que troca os valores dos parâmetros recebidos. 
//Sua assinatura deve ser:void troca(float *a, float *b);

void troca(float *a, float *b) {
    float temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    float a = 10.5;
    float b = 15.7;
    printf("Valor de a = %f\n", a);
    printf("Valor de b = %f\n", b);

    troca(&a, &b);

    printf("Valor pós troca de a = %f\n", a);
    printf("Valor pós troca de b = %f\n", b);
}