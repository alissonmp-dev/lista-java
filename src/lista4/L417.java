/*
Desenvolva um programa em Java que determine o pagamento bruto de cada um de
vários empregados. A companhia paga o valor de uma "hora normal" pelas primeiras
40 horas trabalhadas de cada empregado e paga o valor de uma "hora extra" (uma
vez e meia a hora normal) para cada hora trabalhada depois de completadas as
primeiras 40 horas. Seu programa deve primeiramente receber a informação de
quantos empregados trabalharam durante a semana. Em seguida, receba cada uma
das informações acima descritas, para cada empregado, e mostre o pagamento
bruto para cada um deles. O valor da hora de cada empregado deve ser também
solicitado, pois pode ser diferente para cada empregado.
*/
package lista4;

import java.util.Scanner;

public class L417 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("INFOMRE O NUMERO DO QUADRO DE FUNCIONARIOS: ");
        int quadroDeFuncionarios = in.nextInt();
        int i = 0;
        double salarioBrutoTotal = 0;

        double valorHoraNormalFuncionario;
                
        while ( i < quadroDeFuncionarios ) {
            System.out.print("INFORME O VALOR DA HORA DO FUNCIONARIO: R$ ");
            valorHoraNormalFuncionario = in.nextDouble();

            System.out.print("INFORME AS HORAS TRABALHADAS: ");
            int horas = in.nextInt();

            if (horas > 40) {
                salarioBrutoTotal = 40 * valorHoraNormalFuncionario + 1.5 * valorHoraNormalFuncionario * (horas - 40);
            } else {
                salarioBrutoTotal = 40 * valorHoraNormalFuncionario;
            }

            System.out.printf("SALARIO = %.2f%n", salarioBrutoTotal);
            
            i++;
        }            
       
        in.close();
    }
}