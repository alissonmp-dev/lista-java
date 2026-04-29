package lista2;

import java.util.Scanner;

public class L201 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double metros;
        double centimetros;

        System.out.print("Digite o valor em metros: ");
        metros = in.nextDouble();
        if (metros < 0) {
            System.out.println("Valor nao pode ser menor que 0.");
            in.close();
            return;
        }

        centimetros = metros * 100;

        System.out.printf("%.2f metros corresponde a %.2f centimetros.", metros, centimetros);
        
        in.close();
    }
}