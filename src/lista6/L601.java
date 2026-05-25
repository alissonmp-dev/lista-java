/*
Fazer um programa para ler os dados (matrícula, idade, sexo, altura e concursado [S/N]) de vários funcionários de uma empresa.
O último tem a matrícula igual a zero e não entra nos cálculos.
Calcular e mostrar:
a) o número de funcionárias concursadas;
b) o número de funcionários (somente homens);
c) a maior idade dos homens concursados;
d) a quantidade de mulheres com mais de 30 anos sem concurso;
e) a quantidade de concursados(as);
f) a média das alturas dos homens com menos de 40 anos
*/

package lista6;

import java.util.Scanner;

public class L601 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int matricula = -1;
        int idade = 0;
        int sexo = 0;
        int altura = 0;
        String funcionarioPublico = "";
        int qtdFuncionariosPublicos = 0;
        int qtdFuncionariosHomens = 0;
        int qtdFuncionariosMulheres = 0;
        int qtdMulherConcursada = 0;
        int maiorIdadeHomemConcursado = Integer.MIN_VALUE;
        int qtdMulheresMais30AnosSemConcurso = 0;
        double somaAlturaHomemMenos40Anos = 0;
        int qtdHomemMenos40Anos = 0;

        while (matricula != 0) {
            System.out.print("INFORME O NUMERO DE MATRICULA: ");
            matricula = in.nextInt();
            if (matricula == 0) {
                break;
            }

            System.out.print("INFORME A IDADE: ");
            idade = in.nextInt();
            
            System.out.print("INFORME O SEXO. USE 1 PARA MASCUILINO E 2 PARA FEMININO: ");
            sexo = in.nextInt();
            if (sexo == 1) {
                qtdFuncionariosHomens++;
            } else if (sexo == 2) {
                qtdFuncionariosMulheres++;
            } else {
                System.out.println("OPCAO INVALIDA");
                System.exit(0);
            }
            
            System.out.print("INFORME A ALTURA: ");
            altura = in.nextInt();
            //a média das alturas dos homens com menos de 40 anos
            if (sexo == 1 && idade < 40) {
                somaAlturaHomemMenos40Anos = altura + somaAlturaHomemMenos40Anos;
                qtdHomemMenos40Anos++;
            }

            System.out.print("INFORME SE É FUNCIONARIO PUBLICO. USE S PARA SIM E N PARA NAO");
            funcionarioPublico = in.next();
            if (funcionarioPublico.equals("S")) {
                qtdFuncionariosPublicos++;
                if (sexo == 2) {
                    qtdMulherConcursada++;
                } else if (sexo == 1) {
                    if (maiorIdadeHomemConcursado < idade) {
                        maiorIdadeHomemConcursado = idade;
                    }
                }
            } else if (funcionarioPublico.equals("N")) {
                //a quantidade de mulheres com mais de 30 anos sem concurso;
                if (idade > 30) {
                    if (sexo == 2) {
                        qtdMulheresMais30AnosSemConcurso++;
                    }
                }
            } else {
                System.out.println("OPCAO INVALIDA");
                System.exit(0);
                }

        }

        double mediaAlturaHomemMenos40Anos = somaAlturaHomemMenos40Anos / qtdHomemMenos40Anos;

        System.out.println("QUANTIDADE DE MULHERES CONCURSADAS = " + qtdMulherConcursada);
        System.out.println("QUANTIDADE DE FUNCIOARIOS HOMENS: " + qtdFuncionariosHomens);
        System.out.println("MAIOR IDADE DO HOMEM CONCURSADO: " + maiorIdadeHomemConcursado);
        System.out.println("MEDIA DE ALTURA DE HOMENS COM MENOS DE 40 ANOS: " + mediaAlturaHomemMenos40Anos);
        System.out.println("QUANTIDADE DE MULHERES COM MAIS DE 30 ANOS SEM CONCURSO: " + qtdMulheresMais30AnosSemConcurso);
        System.out.println("QUANTIDADE DE CONCURSADOS: " + qtdFuncionariosPublicos);

        in.close();
    }   
}