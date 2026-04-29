package lista2;

import java.util.Scanner;

public class L202 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base;
        double altura;
        double calcularArea;
        double calcularPerimetro;
        
        System.out.print("Digite a base do retangulo: ");
        base = in.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        altura = in.nextDouble();

        if (base <= 0 || altura <= 0 ) {
            System.out.println("Não é possivel calcular a area do retangulo.");
            in.close();
            return;
        }

        calcularArea = base * altura;
        calcularPerimetro = 2 * altura + 2 * base;

        System.out.println("Area = " + calcularArea);
        System.out.println("Perimetro = " + calcularPerimetro);

        in.close();
    }    
}