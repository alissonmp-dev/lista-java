package lista2;

import java.util.Scanner;

public class L224 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        Escreva um programa que faça a leitura da idade de 2 homens e 2 mulheres
        (supondo que as idades do mesmo sexo serão diferentes). O programa deve fazer o
        somatório da idade do homem mais velho com a idade da mulher mais nova e o
        produto da idade do homem mais novo pela idade da mulher mais velha. Ao final
        você deve imprimir os resultados, e cada uma das idades digitadas: mulher mais
        nova, mulher mais velha, homem mais novo e homem mais velho
        */

        int homemMaisVelho;
        int mulherMaisVelha;
        int homemMaisNovo;
        int mulherMaisNova;

        System.out.print("Digite a idade do homem A: ");
        int idadeHomemA = in.nextInt();

        System.out.print("Digite a idade do homem B: ");
        int idadeHomemB = in.nextInt();
        
        System.out.print("Digite a idade da mulher A: ");
        int idadeMulherA = in.nextInt();
        
        System.out.print("Digite a idade da mulher B: ");
        int idadeMulherB = in.nextInt();

        in.close();

        if (idadeHomemA > idadeHomemB) {
            homemMaisVelho = idadeHomemA;
            homemMaisNovo = idadeHomemB;
        } else {
            homemMaisVelho = idadeHomemB;
            homemMaisNovo = idadeHomemA;
        }

        if (idadeMulherA > idadeMulherB) {
            mulherMaisVelha = idadeMulherA;
            mulherMaisNova = idadeMulherB;
        } else {
            mulherMaisVelha = idadeMulherB;
            mulherMaisNova = idadeMulherA;
        }
        
        int somatorio = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.printf("Homem mais velho = %d.", homemMaisVelho);
        System.out.printf("%nHomem mais novo = %d.", homemMaisNovo);
        System.out.printf("%nMulher mais velha = %d.", mulherMaisVelha);
        System.out.printf("%nMulher mais nova = %d.", mulherMaisNova);
        System.out.printf("%nSomatorio das idades: %d.", somatorio);
        System.out.printf("%nProduto das idades: %d.", produto);
    }
}