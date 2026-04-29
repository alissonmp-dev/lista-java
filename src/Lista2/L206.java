package lista2;

import java.util.Scanner;

public class L206 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ano = 365
        // mes = 30
        // calcular qts dias ja viveu

        System.out.print("Digite  sua idade em anos: ");
        int ano = in.nextInt();
        
        System.out.print("Digite os meses: ");
        int mes = in.nextInt();
        
        System.out.print("Digite os dias: ");
        int dia = in.nextInt();

        in.close();
        
        if (ano < 0 || mes < 0 || mes > 11 || dia < 0 || dia > 30) {
            System.out.println("Valores invalidos.");
            return;
        }

        int totalDias = ano * 365 + mes * 30 + dia;
        
        System.out.println(totalDias);
    }
}