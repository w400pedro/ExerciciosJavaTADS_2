// Escreva um programa que leia do teclado um vetor X de inteiros de 10 elementos.
// • Crie um vetor Y da seguinte forma.
// • Os elementos de Y de índices pares receberão os respectivos elementos de X
// multiplicados por 2.
// • Os elementos de Y de índices ímpares receberão os respectivos elementos de
// X multiplicados por 3.
// • Mostre na tela o vetor Y.

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        int[] x = new int[10];
        int[] y = new int[10];
        int c = 0;
        int cc = 0;
        int valor = 0;

        while (c < 10) {
            System.out.println("Digite a posição " + c + " no seu vetor");
            valor = in.nextInt();
            x[c] = valor;
            c++;
        }
        c = 0;
        while (c < 10) {
            if (c % 2 == 0) {
                y[c] = x[c] * 2;
            } else {
                y[c] = x[c] * 3;
            }
            c++;
        }
        c = 0;
        while (c < 10) {
            System.out.println("O vetor Y na posicao " + c + " é " + y[c]);
            c++;
        }
    }
}