/*
Dado um país A, com X habitantes e uma taxa de natalidade de 3% ao ano, e um
país B com Y habitantes e uma taxa de natalidade de 2% ao ano, escrever um
algoritmo em JAva que seja capaz de calcular e no fim imprimir o tempo necessário
para que a população do país A ultrapasse a população do país B. Considere que X
< Y.
*/

package lista4;

import java.util.Scanner;

public class L422 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        

        int anos = 0;
        /*
        pais A X habitantes taxa natalidade 3% ao ano
        pais B Y habitantes taxa natalidade 2% ao ano
        X < Y
        */

        System.out.print("INFORME O NUMERO DE HABITANTES DO PAIS A: ");
        double numeroDeHabitantesPaisA = in.nextInt();

        System.out.print("INFORME O NUMERO DE HABITANTES DO PAIS B: ");
        double numeroDeHabitantesPaisB = in.nextInt();

        if (numeroDeHabitantesPaisA >= numeroDeHabitantesPaisB) {
            System.out.println("DADOS INVALIDOS");
            System.exit(0);
        }

        while (numeroDeHabitantesPaisA < numeroDeHabitantesPaisB) {
            numeroDeHabitantesPaisA = numeroDeHabitantesPaisA + numeroDeHabitantesPaisA * 0.03;
            numeroDeHabitantesPaisB = numeroDeHabitantesPaisB + numeroDeHabitantesPaisB * 0.02;
            anos++;
        }
        System.out.println("TEMPO NECESSARIO EM ANOS: " + anos);

        in.close();
    }
}