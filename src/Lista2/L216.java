package lista2;

import java.util.Scanner;

public class L216 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String autorizado = "Emprestimo autorizado.";
        String naoAutorizado = "Emprestimo nao autorizado.";
        String resultado;
        
        //juros limite 30%
        
        System.out.print("Digite o valor do salario: R$ ");
        double valorSalario = in.nextDouble();

        System.out.print("Digite o valor do emprestimo: R$ ");
        double valorEmprestimo = in.nextDouble();

        System.out.print("Digite o numero de parcelas do emprestimo: ");
        int qtdParcelas = in.nextInt();

        in.close();

        if(valorSalario <= 0 || valorEmprestimo <= 0 || qtdParcelas <= 0) {
            System.out.println("Valores invalidos.");
            return;
        }

        double valorParcela = valorEmprestimo / qtdParcelas;

        double jurosPermitido = valorSalario * 0.3;

        if (valorParcela > jurosPermitido) {
            resultado = naoAutorizado;
        } else {
            resultado = autorizado;
        }

        System.out.printf("Salario = R$ %.2f.", valorSalario);
        System.out.printf("\nValor do emprestimo = R$ %.2f.", valorEmprestimo);
        System.out.printf("\nQuantidade de parcelas = %d.", qtdParcelas);
        System.out.printf("\nValor da parcela = R$ %.2f.", valorParcela);
        System.out.printf("\nLimite da parcela = R$ %.2f.\n", jurosPermitido);
        System.out.println(resultado);
        
    }
    
}
