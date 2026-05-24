/*
Ler um número inteiro n.
Escrever a soma de todos os números pares de 2 até n.
*/

package lista4;

import java.util.Scanner;

public class L402 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Informe um numero inteiro: ");
        int numero = in.nextInt();

        int somaPar = 0;

        for (int i = 2; i <= numero; i = i + 2){
            somaPar = somaPar + i;
            } 
    System.out.println("Soma dos pares: " + somaPar);

        in.close();
    }
}