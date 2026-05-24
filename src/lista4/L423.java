/*
Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo. 
Sabendo-se que este perde 25% de sua massa a cada 30 segundos.
Escrever um algoritmo em Java que calcule iterativamente e imprima o tempo necessário para que a massa deste material se torne menor que 0,10 grama.
*/

package lista4;

import java.util.Scanner;

public class L423 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tempo = 0;

        System.out.println("INFORME A MASSA DE UM MATERIAL RADIOATIVO: ");
        double massa = in.nextDouble();

        while (massa > 0.10) {
            massa = massa * 0.75;
            tempo = tempo + 30;            
        }
        System.out.printf("LEVARA UM TOTAL DE %d SEGUNDOS", tempo);

        in.close();
    }
}