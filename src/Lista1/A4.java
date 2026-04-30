package lista1;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base, altura, area;
        
        System.out.print("Digite a base: ");
        base = in.nextFloat();
        System.out.print("Digite a altura: ");
        altura = in.nextFloat();

        area = (base * altura) / 2;
        System.out.printf("A = (b * h) / 2\nA = (%.2f * %.2f) / 2\nA = %.2f.",base, altura, area);

        in.close();
    }
}