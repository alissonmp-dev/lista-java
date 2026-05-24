/*
Escreva um algoritmo para ler uma senha.
Se o usuário não digitar a senha correta que é 12345, o algoritmo deve ler novamente, até que seja a senha correta.
O algoritmo deve também contar quantas vezes o usuário tentou digitar a senha correta, ou seja, quantas tentativas de acerto aconteceram.
Escrever essa informação na tela.
*/

package lista4;

import java.util.Scanner;

public class L407 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int senha = 0;
        int i = 0;

        while (senha != 12345) {
        System.out.println("INFORME A SENHA:: ");
        senha = in.nextInt();
        
        i++;
        }
        
        System.out.printf("NUMERO DE TENTATIVAS = %d", i);

        in.close();
    }
}