/*
Criar um algoritmo em Java que leia um conjunto de informações (nome, sexo,
idade, peso e altura) dos atletas que participaram de uma olimpíada, e informar:
- O atleta do sexo masculino mais alto;
- A atleta do sexo feminino mais pesada;
- A média de idade dos atletas.
Deverão ser lidos dados dos atletas até que seja digitado o nome @ para um atleta.
*/

package lista4;

import java.util.Scanner;

public class L424 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome = "0";
        int homemMaisAlto = Integer.MIN_VALUE;
        String nomeHomemMaisAlto = "";
        double mulherMaisPesada = Integer.MIN_VALUE;
        String nomeMulherMaisPesada = "";
        int somaIdadeAtletas = 0;
        int qtdAtletas = 0;


        while (!nome.equals("@")) {
            System.out.print("INFORME O NOME: ");
            nome = in.next();
            if (!nome.equals("@")) {
            System.out.print("INFORME O SEXO: ");
            String sexo = in.next();
            System.out.print("INFORME A IDADE: ");
            int idade = in.nextInt();
            System.out.print("INFORME O PESO: ");
            double peso = in.nextDouble();
            System.out.print("INFORME A ALTURA: ");
            int altura = in.nextInt();
            
            if (sexo.equals("masculino")) {
                if (homemMaisAlto < altura) {
                    homemMaisAlto = altura;
                    nomeHomemMaisAlto = nome;
                }                
            }
            if (sexo.equals("feminino")) {
                if (mulherMaisPesada < peso) {
                    mulherMaisPesada = peso;
                    nomeMulherMaisPesada = nome;
                }
            }
            somaIdadeAtletas = somaIdadeAtletas + idade;
            qtdAtletas++;
            }
        }

        double mediaIdade = (double) somaIdadeAtletas / qtdAtletas;

        System.out.println("ATLETA  MASCULINO MAIS ALTO: " + nomeHomemMaisAlto);
        System.out.println("ATLETA DO SEXO FEMININO MAIS PESADA: " + nomeMulherMaisPesada);
        System.out.println("MEDIA DE IDADE DOS ATLETAS: " + mediaIdade);

        in.close();
    }  
}