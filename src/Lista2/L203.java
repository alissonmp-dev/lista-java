package lista2;

public class L203 {
    public static void main(String[] args) {
        
        int numero = -1;
        String positivo = "É positivo.";
        String negativo = "É negativo.";
        String resposta = "";
        
        if (numero >= 0) {
            resposta = positivo;
        } else {
            resposta = negativo;
        }
        
        System.out.println(resposta);
        String resultado = numero >= 0 ? "É positivo." : "É negativo.";
        System.out.println(resultado);
    }
}