/*
Faça um programa que, para um número indeterminado de pessoas: leia a idade de
cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser
considerada. A seguir calcule:
• o número de pessoas;
• a idade média do grupo;
• a menor idade e a maior idade.
*/
package lista4;

import java.util.Scanner;

public class L418 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int idade = -1;
        int numeroDePessoas = 0;
        int somaIdades = 0;
        int mediaIdades;

        while (idade != 0) {
            System.out.print("INFORME UMA IDADE: ");
            idade = in.nextInt();
            if (idade != 0) {
                somaIdades = somaIdades + idade;
                numeroDePessoas++;
                
                if (idade < menorIdade) {
                menorIdade = idade;
                }
                if (idade > maiorIdade) {
                maiorIdade = idade;
                }
            }
        }            

        if (numeroDePessoas <= 0) {
            System.out.println("NAO FOI INSERIDO NENHUMA IDADE");
        } else {
            
            mediaIdades = somaIdades / numeroDePessoas;
            
            System.out.println("NUMERO DE PESSOAS: " + numeroDePessoas);
            System.out.println("MEDIA IDADES = " + mediaIdades);
            System.out.println("MENOR IDADE = " + menorIdade);
            System.out.println("MAIOR IDADE = " + maiorIdade);
        }

        in.close();
    }
}