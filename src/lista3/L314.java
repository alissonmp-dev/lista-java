package lista3;

import java.util.Scanner;

public class L314 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME A NOTA: ");
        double nota1 = in.nextDouble();
        
        System.out.print("INFORME A NOTA: ");
        double nota2 = in.nextDouble();

        System.out.print("INFORME A NOTA: ");
        double nota3 = in.nextDouble();

        double mediaNotas = (nota1 + nota2 + nota3) / 3;
        
        String conceito;

        if (mediaNotas < 6) {
            conceito = "D";
        } else if (mediaNotas >= 6 && mediaNotas < 7.5 ) {
            conceito = "C";
        } else if (mediaNotas >= 7.5 && mediaNotas < 9){
            conceito = "B";
        } else {
            conceito = "A";
        }

        System.out.println("CONCEITO = " + conceito);
        
        in.close();
    }
}