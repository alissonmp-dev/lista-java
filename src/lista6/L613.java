/*
Considere que:
país A, com X habitantes e uma taxa de natalidade de 3% ao ano;
país B com Y habitantes e uma taxa de natalidade de 1,5% ao ano.
Escreva um algoritmo em JAva que seja capaz de calcular e no fim imprimir o tempo necessário para que a população do país A ultrapasse a população do país B.
Considere que X < Y.
*/

package lista6;

import java.util.Scanner;

public class L613 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int anos = 0;


        System.out.print("INFORME A POPULAÇÂO DO PAIS A: ");
        double populaçãoPaisA = in.nextDouble();

        System.out.print("INFORME A POPULAÇÂO DO PAIS B: ");
        double populaçãoPaisB = in.nextDouble();

        while (populaçãoPaisA < populaçãoPaisB) {
            populaçãoPaisA = populaçãoPaisA + populaçãoPaisA * 3 / 100;
            populaçãoPaisB = populaçãoPaisB + populaçãoPaisB * 1.5 / 100;
            anos++;
        }

        System.out.println("ANOS = " + anos);
        in.close();
    }   
}