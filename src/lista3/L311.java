package lista3;

import java.util.Scanner;

public class L311 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    /*
        Escreva um algoritmo para ler o número de lados de um polígono regular e a medida
        do lado (em cm). Calcular e imprimir o seguinte:
        - Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu
        perímetro.
        - Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
        - Se o número de lados for igual a 5 escrever PENTÁGONO.
        Observação: Considere que o usuário só informará os valores 3, 4 ou 5
     */

        System.out.print("Informe o numero de lados de um poligono: ");
        int numeroLados = in.nextInt();
        
        if (numeroLados == 3) {
            System.out.println("TRIÂNGULO");
            System.out.print("Informe o valor do lado: ");
            double ladoTriangulo = in.nextDouble();

            double perimetro = 3 * ladoTriangulo;
            System.out.print("PERIMETRO = " + perimetro);

        } else if (numeroLados == 4) {
            System.out.println("QUADRADO");
            System.out.print("Informe o valor do lado do quadrado: ");
            double ladoQuadrado = in.nextDouble();

            double area = ladoQuadrado * ladoQuadrado;
            System.out.println("AREA = " + area);

        } else if (numeroLados == 5) {
            System.out.print("PENTAGONO");
        } else {
            System.out.print("VALOR INVALIDO");
        }

        in.close();
    }
}