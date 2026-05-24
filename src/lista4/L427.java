/*
Faça um programa que receba um valor inteiro, e imprima na tela o dobro dele, ao lado da soma com seu antecessor. 
Faça isso consecutivamente, imprimindo  sempre o dobro do valor que apareceu na tela e a soma com o antecessor, por N vezes.
O valor de N é fornecido pelo usuário.
Por exemplo: Recebe o valor inteiro 2, e N = 3, então imprime:
Dobro = 4 Soma com Antecessor = 4
Dobro = 8 Soma com Antecessor = 12
Dobro = 16 Soma com Antecessor = 24
Dobro = 32 Soma com Antecessor = 48
O limite de execução é quando atingir o valor de N, ou quando o dobro ou a soma atingirem o valor inteiro de 100.000.
*/

package lista4;

import java.util.Scanner;

public class L427 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("FORNEÇA UM VALOR INTEIRO: ");
        int valor = in.nextInt();

        System.out.print("FORNEÇA O VALOR DE N: ");
        int n = in.nextInt();

        int soma = 0;
        int anterior = 0;
        
        for (int i = 0; i <= n && valor < 100000 && soma < 100000; i++) {
            
            valor = valor * 2;
            soma = valor + anterior;
            anterior = valor;
            
            if (valor >= 100000 || soma >= 100000) {
                break;
            }
                        
            System.out.print("DOBRO = " + valor);
            System.out.println(" SOMA COM ANTECESSOR = " + soma); 
        }


        in.close();
    }
}