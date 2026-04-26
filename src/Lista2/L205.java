public class L205 {
    public static void main(String[] args) {
        int num1 = 7;
        int denominador = 2;
        String erro = "Denomiador deve ser diferente de 0.";
        String resultado = "";

        if (denominador != 0) {
            int divisao = num1 / denominador;
            resultado = "" +divisao;
        } else {
            resultado = erro;
        }
        System.out.println(resultado);
    }
}