package lista3;

import java.util.Scanner;

public class L310 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a altura em cm: ");
        int altura = in.nextInt();

        System.out.printf("Digite o sexo:%n1 - FEMININO%n2 - MASCULINO%n");
        int sexo = in.nextInt();
        double pesoIdeal;

        if (sexo == 1) {
            pesoIdeal = 52 + (0.75 * (altura - 152.4));
        } else if (sexo == 2) {
            pesoIdeal = 52 + (0.67 * (altura - 152.4));
        } else {
            System.out.println("VALOR INVALIDO");
            in.close();
            return;
        }
        
        System.out.printf("Peso ideal = %.2f", pesoIdeal);

        in.close();        
    }
}