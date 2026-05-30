/*
Desafio 1. 
Dado dois vetores de tamanho 5 e com valores ordenados, criar um vetor de tamanho 10 com todos elementos ordenados.
O programa deve receber 5 valores do primeiro vetor, 5 valores do segundo vetor e, finalmente, mostrar o vetor final com 10 posições com os valores ordenados.
Ex: 
v1 = [1, 3, 5, 7, 9]
v2 = [2, 4, 6, 8, 10]
v3 =  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
*/
package lista8;

import java.util.Scanner;

public class L816 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[10];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("INFORME O VALOR DA POSIÇÂO " + i + "  NO V1: ");
            v1[i] = in.nextInt();
        }
        
        for (int j = 0; j < v2.length; j++) {
            System.out.print("INFORME O VALOR DA POSIÇÂO " + j + "  NO V2: ");
            v2[j] = in.nextInt();
        }

        System.out.print("V1 = { ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println("}");

        System.out.print("V2 = { ");
        for (int j = 0; j < v2.length; j++) {
            System.out.print(v2[j] + " ");
        }
        System.out.println("}");

        for (int m = 0; m < v1.length; m++) {
            v3[m] = v1[m];
            v3[m+v1.length] = v2[m];
        }

        System.out.print("V3 = { ");
        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }
        System.out.println("}");

        for (int i = 0; i < v3.length; i++) {
            for (int j = 0; j < v3.length; j++) {
                if (v3[i] < v3[j]) {
                    int aux = v3[i];
                    v3[i] = v3[j];
                    v3[j] = aux;
                }
            }
        }

        System.out.print("V4 = { ");
        for (int a = 0; a < v3.length; a++) {
            System.out.print(v3[a] + " ");
        }
        System.out.println("}");


        System.out.println("BOLHAS");

        bubbleSort(v3);

        System.out.print("BOLHAS = { ");
        for (int a = 0; a < v3.length; a++) {
            System.out.print(v3[a] + " ");
        }
        System.out.println("}");

        in.close();
    }   
    public static void bubbleSort(int v3[]) {
        for (int i = 0; i < v3.length - 1; i++) {
            for (int j = 0; j < v3.length - 1; j++) {
                if (v3[j] > v3[j+1]) {
                    int temp = v3[j];
                    v3[j] = v3[j+1];
                    v3[j+1] = temp;
                }    
            }
        }
    }   
}