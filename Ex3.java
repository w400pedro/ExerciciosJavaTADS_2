// Faça um programa que leia um vetor de 10 posições com valores inteiros positivos.
// • Verifique se existem valores iguais e os escreva na tela.
// • Não usar vetor auxiliar.
// • Exemplo:
// • Se o vetor for igual a [1, 2, 3, 1, 4, 5, 5, 6, 7, 2], deve-se imprimir “1, 2, 5”.


import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        int c = 0;
        int valor = 0;
        int cc = 0;
        int[] v = new int[10];

        while (c < 10) {
            System.out.println("Digite a posição " + c + " no seu vetor");
            valor = in.nextInt();
            v[c] = valor;
            c++;
        }
        c = 0;

        while (c < 10) {
            while (cc < 10) {
                if (v[c] == v[cc] && c != cc) {
                    System.out.println("O valor " + v[c] + " é repetido");
                    break;
                }
                cc++;
            }
            cc = c;
            c++;
        }

    }
}