package lista2;

import java.util.Scanner;

public class L209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o raio da circunferencia: ");
        double raio = in.nextDouble();

        in.close();

        if (raio <= 0) {
            System.out.println("Raio invalido.");
            return;
        }

        //final pois é uma constante que nao deve ser alterada e PI em maisculo pela convenção
        final double PI = 3.141692;

        double diametro = 2 * raio;
        double comprimento = 2 * raio * PI;
        double area = PI * raio * raio;

        System.out.println("Diametro = " + diametro);
        System.out.println("Comprimento = " + comprimento);
        System.out.println("Area = " + area);
    } 
}
