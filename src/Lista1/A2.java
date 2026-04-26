package Lista1;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numero, resultado;

        System.out.print("Digite um numero: ");
        numero = in.nextFloat();
        resultado = numero * 1.2f;
        System.out.printf("120%% de %.2f é %.2f", numero, resultado);
        
        in.close();
    }   
}