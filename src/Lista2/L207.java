package lista2;

import java.util.Scanner;

public class L207 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite quanto ganha por hora: R$ ");
        double salarioHora = in.nextDouble();

        System.out.print("Digite quantas horas trabalha por mês: ");
        double horasTotal = in.nextDouble();

        if (salarioHora <= 0 || horasTotal < 0) {
            System.out.println("Salario ou horas trabalhadas invalido.");
            in.close();
            return;
        }

        double totalSalarioSemDesconto = salarioHora * horasTotal;
        double totalSalarioComDesconto = totalSalarioSemDesconto * 0.85;

        System.out.printf("Salario a receber sem desconto: R$ %.2f.", totalSalarioSemDesconto);
        System.out.printf("\nSalario a receber com desconto de 15%%: R$ %.2f", totalSalarioComDesconto);
        
        System.out.print("\nQual a % de desconto é descontado do salário? ");
        double porcentagemDesconto = in.nextDouble();

        in.close();

        if (porcentagemDesconto <= 0 || porcentagemDesconto >= 100) {
            System.out.println("Desconto invalido.");
            return;
        }
        double totalSalarioComDescontoInformado = totalSalarioSemDesconto * (100 - porcentagemDesconto) / 100;

        System.out.printf("\nSalario a receber com o imposto de %.2f %%: R$ %.2f", porcentagemDesconto, totalSalarioComDescontoInformado);
        
    }
}