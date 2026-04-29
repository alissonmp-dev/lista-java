package lista2;

import java.util.Scanner;

public class L213 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double mediaAritmetica;

        System.out.print("Digite a nota da avaliação 1: ");
        double nota1 = in.nextDouble();

        System.out.print("Digite a nota da avaliação 2: ");
        double nota2 = in.nextDouble();

        in.close();

        if(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Notas invalidas.");
            return;
        }

        mediaAritmetica = (nota1 + nota2) / 2;

        String resultado = mediaAritmetica < 6 ? "Média = " +mediaAritmetica + ". Reprovado" : "Média = " + mediaAritmetica + ". Aprovado";
        System.out.println(resultado);

    }
    
}
