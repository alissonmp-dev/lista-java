package lista3;

import java.util.Scanner;

public class L304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
               
        System.out.print("Digite o primeiro numero: ");
        double valorA = in.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double valorB = in.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double valorC = in.nextDouble();

        String ordemDosValores = "";
        double menor, maior, meio;
        
        if (valorA == valorB || 
            valorA == valorC || 
            valorB == valorC) {
            System.out.print("Valores nao podem ser iguais.");
            in.close();
            return;
        }

        if (valorA > valorB && 
            valorA > valorC && 
            valorB > valorC) {
            ordemDosValores = valorC + ", " + valorB + ", " + valorA;
        }
        
        if (valorA > valorB &&
            valorA > valorC && 
            valorB > valorC) {
            ordemDosValores = valorC + ", " + valorB + ", " + valorA;
        }

        if (valorA > valorB && valorA > valorC && valorB > valorC) {
            ordemDosValores = valorC + ", " + valorB + ", " + valorA;
        }

        System.out.println(ordemDosValores);
    }
}