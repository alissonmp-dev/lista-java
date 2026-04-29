package lista2;

import java.util.Scanner;

public class L210 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String categoria = "";

        System.out.print("Digite sua idade: ");
        int idade = in.nextInt();

        in.close();

        if (idade < 0) {
            System.out.println("Idade invalida");
            return;
        }

        if( idade < 9) {
            categoria = "Mirim";
        } else if (idade < 14) {
            categoria = "Infantil";
        } else if (idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}