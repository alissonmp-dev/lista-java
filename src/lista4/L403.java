/*
Ler um número inteiro n. 
Decidir se n é um número primo e apresente o resultado.
*/

package lista4;

import java.util.Scanner;

public class L403 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Informe um numero inteiro: ");
        int numero = in.nextInt();

        boolean primo = true;

        if ( numero < 2) {
            primo = false;
        }
        
        for (int i = 2; i < numero; i++){
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        
        if (primo == true) {
            System.out.println("É PRIMO");
        } else {
            System.out.println("NAO É PRIMO");
        }

        in.close();
    }
}