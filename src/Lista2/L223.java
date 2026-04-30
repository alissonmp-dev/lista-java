package lista2;

import java.util.Scanner;

public class L223 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String msg;
        
        System.out.print("Informe a quantidade atual do produto no estoque: ");
        double qtdAtualEstoque = in.nextDouble();
        
        System.out.print("Informe a quantidade maxima do produto no estoque: ");
        double qtdMaximaEstoque = in.nextDouble();
        
        System.out.print("Informe a quantidade minima do produto no estoque: ");
        double qtdMinimaEstoque = in.nextDouble();

        in.close();

        double qtdMediaEstoque = (qtdMaximaEstoque + qtdMinimaEstoque) / 2;
        
        if (qtdAtualEstoque >= qtdMediaEstoque) {
            msg = "Não efetuar compra";
        } else {
            msg = "Efetuar compra";
        }

        System.out.printf("Quantidade média = %.2f. %s.", qtdMediaEstoque, msg);
    }    
}