package Lista1;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.print("Digite °F ");
        fahrenheit = in.nextFloat();
        celsius = (fahrenheit - 32) / 1.8f;
        System.out.printf("%.2f °C.",celsius);

        in.close();
    }
}