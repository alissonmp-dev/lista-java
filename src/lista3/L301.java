package lista3;

import java.util.Scanner;

public class L301 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String msg;
        
        System.out.print("Digite um numero: ");
        double valor = in.nextDouble();

        in.close();
        
        if (valor == 0) {
            msg = "zero";
        } else if (valor < 0) {
            msg = "negativo";
        } else {
            msg = "positivo";
        }
            
        System.out.print("O numero é " + msg);   
    }
}