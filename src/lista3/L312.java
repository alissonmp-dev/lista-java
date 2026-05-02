package lista3;

import java.util.Scanner;

public class L312 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        System.out.print("Informe o numero de lados de um poligono: ");
        int numeroLados = in.nextInt();
      
        if (numeroLados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else if (numeroLados == 3) {
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
            System.out.print("POLÍGONO NÃO IDENTIFICADO");
        }

        in.close();
    }
}