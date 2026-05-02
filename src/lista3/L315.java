package lista3;

import java.util.Scanner;

public class L315 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int a, b, c;
        String mensagem;

        System.out.println("Digite valores de a, b, c");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                mensagem = "Triângulo Equilátero";
            } else {
                if ( a == b || b == c || a == c) {
                    mensagem = "Triângulo Isósceles";
                } else {
                    mensagem = "Triângulo Escaleno";
                }
            }
        } else { 
            mensagem = "Não é possível formar um triângulo";
        }
        
        System.out.println(mensagem);
    }
}