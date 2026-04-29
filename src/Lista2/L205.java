package lista2;

public class L205 {
    public static void main(String[] args) {
        
        double numero = 7;
        double denominador = 0;
        String erro = "Denominador deve ser diferente de 0.";
        String resultado = "";

        if (denominador != 0) {
            double divisao = numero / denominador;
            resultado = "" +divisao;
        } else {
            resultado = erro;
        }

        System.out.println(resultado);
    }
}