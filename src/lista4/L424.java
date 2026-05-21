/*
Criar um algoritmo em Java que leia um conjunto de informações (nome, sexo,
idade, peso e altura) dos atletas que participaram de uma olimpíada, e informar:
- O atleta do sexo masculino mais alto;
- A atleta do sexo feminino mais pesada;
- A média de idade dos atletas.
Deverão ser lidos dados dos atletas até que seja digitado o nome @ para um atleta.
*/

package lista4;

import java.util.Scanner;

public class L424 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome = "0";

        while (nome != "@") {
            System.out.println("INFORME O NOME: ");
            nome = in.nextLine();
            System.out.println("INFORME O SEXO: ");
            String sexo = in.next();
            System.out.println("INFORME A IDADE: ");
            String idade = in.next();
            System.out.println("INFORME O PESO: ");
            String peso = in.next();
            System.out.println("INFORME A ALTURA: ");
            String altura = in.next();

        }
    }  
}