// • Modifique o exercício anterior para que a saída não mostre valores repetidos.
// • Exemplo:
// • Se o vetor for igual a [1, 1, 1, 1, 1, 2, 2, 2, 1, 2], deve-se imprimir “1, 2”.

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        int c = 0;
        int valor = 0;
        int cc = 0;
        int[] v = new int[10];
        int[] repetidos = new int[5];
        int repetidosqtd = 0;
        int repetidosc = 0;
        boolean confirmarepetido = false;

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
                    {
                        while (repetidosc < repetidosqtd) {
                            if (v[c] == repetidos[repetidosc]) {
                                confirmarepetido = true;
                            }
                            repetidosc++;
                        }
                    }
                    repetidosc = 0;
                    if (confirmarepetido == false) {
                        repetidos[repetidosqtd] = v[c];
                        repetidosqtd++;
                        System.out.println("O valor " + v[c] + " é repetido");
                    }
                    confirmarepetido = false;
                    break;
                }
                cc++;
            }
            cc = c;
            c++;
        }

    }
}