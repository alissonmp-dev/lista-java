/*
Faça um programa que receba a altura e o peso de várias pessoas até que sejam informados os valores zero para a altura.
Calcule o IMC e mostre ao final quantas pessoas estão em cada faixa de IMC conforme o quadro a seguir:
IMC = Peso / (Altura x Altura)
Categoria           IMC
Abaixo do peso      Abaixo de 18,5
Peso normal         18,5 - 24,9
Sobrepeso           25,0 - 29,9
Obesidade Grau I    30,0 - 34,9
Obesidade Grau II   35,0 - 39,9
Obesidade Grau III  40,0 e acima
*/

package lista6;

import java.util.Scanner;

public class L603 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int qtdAbaixoPeso = 0;
        int qtdPesoNormal = 0;
        int qtdSobrepeso = 0;
        int qtdObesidadeI = 0;
        int qtdObesidadeII = 0;
        int qtdObesidadeIII = 0;
        

        double altura = -1;
        double peso = 0;


        while (altura != 0) {
            System.out.print("INFORME A ALTURA: ");
            altura = in.nextDouble();

            if (altura > 0) {
                System.out.print("INFORME O PESO: ");
                peso = in.nextDouble();
                
                double IMC = peso / (altura / 100 * altura / 100);
                
                if (IMC < 18.5) {
                    qtdAbaixoPeso++;
                } else if (IMC < 25) {
                    qtdPesoNormal++;
                } else if (IMC < 30) {
                    qtdSobrepeso++;
                } else if (IMC < 35) {
                    qtdObesidadeI++;
                } else if (IMC < 40) {
                    qtdObesidadeII++;
                } else {
                    qtdObesidadeIII++;
                }
            }
        }
    

        System.out.println("CATEGORIA ABAIXO DO PESO =  " + qtdAbaixoPeso );
        System.out.println("CATEGORIA PESO NORMAL = " + qtdPesoNormal);
        System.out.println("CATEGORIA SOBREPESO = " + qtdSobrepeso);
        System.out.println("CATEGORIA OBESIDADE I = " + qtdObesidadeI);
        System.out.println("CATEGORIA OBESIDADE II = " + qtdObesidadeII);
        System.out.println("CATEGORIA OBESIDADE III = " + qtdObesidadeIII);
        
        in.close();
    }   
}