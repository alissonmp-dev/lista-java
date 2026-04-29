package lista2;

import java.util.Scanner;

public class L214 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String apto = "Pode votar.";
        final String naoApto = "Nao pode votar.";
        String resultado;

        System.out.print("Digite o ano atual: ");
        int anoAtual = in.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = in.nextInt();

        in.close();

        int idade = anoAtual - anoNascimento;

        String resultadoTernario = idade < 0 ? "Dados invalidos" :idade >= 18 ? apto : naoApto;

        if(anoAtual < anoNascimento) {
            System.out.println("Dados invalidos.");
            return;
        } else if (idade < 18) {
            resultado = naoApto;
        } else {
            resultado = apto;
        }
        System.out.println(resultado);
        System.out.println(resultadoTernario);
    }
    
}
