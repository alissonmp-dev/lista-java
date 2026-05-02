package lista3;

import java.util.Scanner;

public class L305 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double valorA = in.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double valorB = in.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double valorC = in.nextDouble();

        String ehTriangulo;

        double somaLadoAC = valorA + valorC;
        double somaLadoAB = valorA + valorB;
        double somaLadoCB = valorC + valorB;

        if (somaLadoAB > valorC && somaLadoAC > valorB && somaLadoCB > valorA) {
            ehTriangulo = "Sim";
        } else {
            ehTriangulo = "Nao";
        }

        in.close();
        
        System.out.println("É triangulo? " + ehTriangulo);
    }
}