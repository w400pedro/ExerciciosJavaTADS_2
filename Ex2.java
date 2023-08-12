// • Crie um programa que leia do teclado um vetor U de 10 elementos.
// • Utilize uma estrutura de repetição para trocar o 1o. elemento com o último, o 2o. com o penúltimo, etc. até o 5o. com o 6o.
// • Não usar vetor auxiliar.
// • Imprima na tela o vetor U modificado.

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        int[] u = new int[10];
        int c = 0;
        int cc = 9;
        int valor = 0;
        int valor1 = 0;
        int valor2 = 0;

        while (c < 10) {
            System.out.println("Digite a posição " + c + " no seu vetor");
            valor = in.nextInt();
            u[c] = valor;
            c++;
        }

        c = 0;

        while (c < 5) {
            valor1 = u[c];
            valor2 = u[cc];
            u[c] = valor2;
            u[cc] = valor1;
            c++;
            cc--;
        }
        c = 0;
        while (c < 10) {
            System.out.println("O vetor U na posicao " + c + " é " + u[c]);
            c++;
        }

    }
}