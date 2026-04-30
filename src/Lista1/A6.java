package lista1;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite a nota 1: ");
        float nota1 = in.nextFloat();
        System.out.print("Digite a nota 2: ");
        float nota2 = in.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.printf("Média = %.2f", media);

        in.close();
    } 
}