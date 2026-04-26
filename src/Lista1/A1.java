package Lista1;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, antecessor, sucessor;

        System.out.print("Digite um numero: ");
        numero = in.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        in.close();
    }
}