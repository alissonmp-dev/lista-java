package lista3;

import java.util.Scanner;

public class L309 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite a nota da primeira avaliação: ");
        double notaPrimeiraAvaliacao = in.nextDouble();

        System.out.print("Digite a nota da segunda avaliação: ");
        double notaSegundaAvaliacao = in.nextDouble();

        System.out.printf("Digite a nota da avaliação optativa.%nCaso nao tenha feito, digite -1: ");
        double notaOptativa = in.nextDouble();

        double notaFinal1;
        double notaFinal2;
        double mediaNotas;

        if (notaOptativa == -1) {
            notaFinal1 = notaPrimeiraAvaliacao;
            notaFinal2 = notaSegundaAvaliacao;
        } else if ( notaPrimeiraAvaliacao > notaSegundaAvaliacao && notaOptativa > notaSegundaAvaliacao) {
            notaFinal1 = notaPrimeiraAvaliacao;
            notaFinal2 = notaOptativa;
        } else if (notaPrimeiraAvaliacao > notaSegundaAvaliacao && notaSegundaAvaliacao > notaOptativa) {
            notaFinal1 = notaPrimeiraAvaliacao;
            notaFinal2 = notaSegundaAvaliacao;
        } else if (notaSegundaAvaliacao > notaPrimeiraAvaliacao && notaOptativa > notaPrimeiraAvaliacao) {
            notaFinal1 = notaSegundaAvaliacao;
            notaFinal2 = notaOptativa;
        } else if (notaSegundaAvaliacao > notaPrimeiraAvaliacao && notaPrimeiraAvaliacao > notaOptativa) {
            notaFinal1 = notaSegundaAvaliacao;
            notaFinal2 = notaPrimeiraAvaliacao;
        } else {
            notaFinal1 = notaPrimeiraAvaliacao;
            notaFinal2 = notaSegundaAvaliacao;
        }

        mediaNotas = (notaFinal1 + notaFinal2) / 2;

        System.out.printf("MÉDIA = %.2f.%n", mediaNotas);

        String situacao;

        if (mediaNotas >= 6) {
            situacao = "APROVADO";
        } else if (mediaNotas < 3) {
            situacao = "REPROVADO";
        } else {
            situacao = "EXAME";
        }

        System.out.print(situacao);

        in.close();
    }
}